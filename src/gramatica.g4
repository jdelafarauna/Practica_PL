grammar gramatica;


@members {
    String currentFunction = null;
}


prg : 'program' ID ';' {System.out.print("#include <stdio.h> \n\n");} blq '.' ;

blq : dcllist 'begin' sentlist 'end' ;

dcllist : dcl dcllistPrima | ;
dcllistPrima : dcl dcllistPrima | ;

dcl : defcte | defvar | defproc | deffun ;

defcte : 'const' ctelist ;
ctelist : ID '=' simpvalue ';' {System.out.println("#define " + $ID.text + " " + $simpvalue.text);} ctelistPrima ;
ctelistPrima : ID '=' simpvalue ';' {System.out.println("#define " + $ID.text + " " + $simpvalue.text);} ctelistPrima | ;

simpvalue : CONSTINT | CONSTREAL | CONSTLIT ;

defvar : 'var' defvarlist ';' ;
defvarlist : varlist ':' tbas {System.out.print($tbas.val + " " + $varlist.text + ";\n");} defvarlistPrima ;
defvarlistPrima : ';' varlist ':' tbas {System.out.println($tbas.val + " " + $varlist.text + ";\n");} defvarlistPrima | ;

varlist : ID varlistPrima ;
varlistPrima : ',' ID varlistPrima | ;

defproc
returns [String fname]
    : 'procedure' ID { $fname = $ID.text; }
      fp=formal_paramlist
      ';'
      { System.out.print("void " + $fname); System.out.print("(" + $fp.text + ") {\n"); }
      blq
      ';'
      { System.out.println("}"); }
    ;

deffun
    : 'function' ID fname=formal_paramlist ':' rtype=tbas ';' {
        currentFunction = $ID.text;
        System.out.print($rtype.val + " " + currentFunction + "(" + $fname.text + ") {\n");
    }
      blq
    ';' {
        System.out.println("}");
        currentFunction = null; // limpiar después de la función
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

sentlist : sent sentlistPrima ;
sentlistPrima : sent sentlistPrima | ;

sent : asig ';' | proc_call ';' | write ;

asig
    : ID ':=' exp {
        if ($ID.text.equals(currentFunction)) {
            System.out.println("return " + $exp.text + ";");
        } else {
            System.out.println($ID.text + " = " + $exp.text + ";");
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
                // Cadena literal: eliminar comillas y añadir al formato
                format.append(val.substring(1, val.length() - 1));
            } else {
                // Expresión (número, variable, etc.)
                format.append("%d");
                args.add(val);
            }
        }

        if ($wtype.text.equals("writeln")) format.append("\\n");

        if (args.isEmpty()) {
            System.out.println("printf(\"" + format + "\");");
        } else {
            System.out.print("printf(\"" + format + "\", ");
            for (int i = 0; i < args.size(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(args.get(i));
            }
            System.out.println(");");
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
