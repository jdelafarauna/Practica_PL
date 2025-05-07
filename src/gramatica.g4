grammar gramatica;

@members {
    String currentFunction = null;
    int indentLevel = 0;

    void println(String line) {
        for (int i = 0; i < indentLevel; i++) System.out.print("    ");
        System.out.println(line);
    }

    void print(String line) {
        for (int i = 0; i < indentLevel; i++) System.out.print("    ");
        System.out.print(line);
    }
}

prg
: 'program' ID ';'
  {
    System.out.println("#include <stdio.h>\n");
  }
  dcllist
  {
    System.out.println();
    println("int main() {");
    indentLevel++;
  }
  'begin' sentlist 'end' '.'
  {
    println("return 0;");
    indentLevel--;
    println("}");
  }
;

dcllist : dcl dcllistPrima | ;
dcllistPrima : dcl dcllistPrima | ;

dcl : defcte | defvar | defproc | deffun ;

defcte : 'const' ctelist {println("");};
ctelist : ID '=' simpvalue ';' { println("#define " + $ID.text + " " + $simpvalue.text); } ctelistPrima ;
ctelistPrima : ID '=' simpvalue ';' { println("#define " + $ID.text + " " + $simpvalue.text); } ctelistPrima | ;

simpvalue : CONSTINT | CONSTREAL | CONSTLIT ;

defvar : 'var' defvarlist ';' {println("");};
defvarlist : varlist ':' tbas { println($tbas.val + " " + $varlist.text + ";"); } defvarlistPrima ;
defvarlistPrima : ';' varlist ':' tbas { println($tbas.val + " " + $varlist.text + ";"); } defvarlistPrima | ;

varlist : ID varlistPrima ;
varlistPrima : ',' ID varlistPrima | ;

defproc
returns [String fname]
    : 'procedure' ID { $fname = $ID.text; }
      fp=formal_paramlist
      ';'
      { print("void " + $fname); print("(" + $fp.text + ") {"); System.out.println(); indentLevel++; }
      blq
      ';'
      { indentLevel--; println("}"); }
    ;

deffun
    : 'function' ID fname=formal_paramlist ':' rtype=tbas ';' {
        currentFunction = $ID.text;
        print($rtype.val + " " + currentFunction + "(" + $fname.text + ") {");
        System.out.println();
        indentLevel++;
    }
      blq
    ';' {
        indentLevel--;
        println("}");
        currentFunction = null;
    }
    ;

formal_paramlist returns [String text = ""]
    : '(' params+=formal_param ( ';' params+=formal_param )* ')' {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < $params.size(); i++) {
            if (i > 0) builder.append(", ");
            builder.append($params.get(i).text);
        }
        $text = builder.toString();
    }
    | { $text = ""; }
    ;

formal_param returns [String text]
    : vl=varlist ':' tb=tbas {
        $text = $tb.val + " " + $vl.text;
    }
    ;

formal_paramPrima returns [String text]
    : ';' next=formal_param { $text = ", " + $next.text; }
    |                        { $text = ""; }
    ;

tbas returns [String val]
    : 'INTEGER' { $val = "int"; }
    | 'REAL'    { $val = "float"; }
    ;

blq : dcllist 'begin' sentlist 'end' ;

sentlist : sent sentlistPrima ;
sentlistPrima : sent sentlistPrima | ;

sent : asig ';' | proc_call ';' | write ;

asig
    : ID ':=' exp {
        if ($ID.text.equals(currentFunction)) {
            println("return " + $exp.text + ";");
        } else {
            println($ID.text + " = " + $exp.text + ";");
        }
    }
    ;

exp : factor expPrima ;
expPrima : op factor expPrima | ;
op : oparit ;
oparit : '+' | '-' | '*' | 'div' | 'mod' ;

factor : simpvalue | '(' exp ')' | ID subparamlist ;

subparamlist : '(' explist ')' | ;
explist : exp explistPrima ;
explistPrima : ',' exp explistPrima | ;

proc_call : ID subparamlist ;

write
    : wtype=('writeln' | 'write') '(' exprList ')' ';' {
        StringBuilder format = new StringBuilder();
        List<String> args = new ArrayList<>();

        for (int i = 0; i < $exprList.values.size(); i++) {
            String val = $exprList.values.get(i);
            if (val.startsWith("'")) {
                format.append(val.substring(1, val.length() - 1));
            } else {
                format.append("%d");
                args.add(val);
            }
        }

        if ($wtype.text.equals("writeln")) format.append("\\n");

        if (args.isEmpty()) {
            println("printf(\"" + format + "\");");
        } else {
            StringBuilder line = new StringBuilder("printf(\"" + format + "\", ");
            for (int i = 0; i < args.size(); i++) {
                if (i > 0) line.append(", ");
                line.append(args.get(i));
            }
            line.append(");");
            println(line.toString());
        }
    }
    ;

exprList returns [List<String> values = new ArrayList<>()]
    : a=exp { $values.add($a.text); } (',' b=exp { $values.add($b.text); })* ;

writeArgs returns [String vlex]
@init { $vlex = ""; }
    : a=(ID | CONSTINT | CONSTREAL | CONSTLIT) { $vlex = $a.text; }
      (',' b=(ID | CONSTINT | CONSTREAL | CONSTLIT) { $vlex += "," + $b.text; })*
    ;

ID: [a-zA-Z] [a-zA-Z0-9_]*;
CONSTINT: ('+' | '-')? [0-9]+;
CONSTREAL: (('+' | '-')? [0-9]+ '.' [0-9]+
            |('+' | '-')? [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+
            |('+' | '-')? [0-9]+ '.' [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+);
CONSTLIT: '\'' (~('\''| '\\') | '\\\'')* '\'' ;

COMENTARIO_LINEA: '{' ~[\r\n]* '}' -> skip;
COMENTARIO_MULTILINEA: '(*' .*? '*)' -> skip;
WS: [ \t\r\n]+ -> skip;
