// Generated from C:/Users/jdela/IdeaProjects/Practica_PL/src/gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, CONSTINT=26, CONSTREAL=27, CONSTLIT=28, COMENTARIO_LINEA=29, COMENTARIO_MULTILINEA=30, 
		WS=31;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_dcllistPrima = 2, RULE_dcl = 3, RULE_defcte = 4, 
		RULE_ctelist = 5, RULE_ctelistPrima = 6, RULE_simpvalue = 7, RULE_defvar = 8, 
		RULE_defvarlist = 9, RULE_defvarlistPrima = 10, RULE_varlist = 11, RULE_varlistPrima = 12, 
		RULE_defproc = 13, RULE_deffun = 14, RULE_formal_paramlist = 15, RULE_formal_param = 16, 
		RULE_formal_paramPrima = 17, RULE_tbas = 18, RULE_blq = 19, RULE_sentlist = 20, 
		RULE_sentlistPrima = 21, RULE_sent = 22, RULE_asig = 23, RULE_exp = 24, 
		RULE_expPrima = 25, RULE_op = 26, RULE_oparit = 27, RULE_factor = 28, 
		RULE_subparamlist = 29, RULE_explist = 30, RULE_explistPrima = 31, RULE_proc_call = 32, 
		RULE_write = 33, RULE_exprList = 34, RULE_writeArgs = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "dcllistPrima", "dcl", "defcte", "ctelist", "ctelistPrima", 
			"simpvalue", "defvar", "defvarlist", "defvarlistPrima", "varlist", "varlistPrima", 
			"defproc", "deffun", "formal_paramlist", "formal_param", "formal_paramPrima", 
			"tbas", "blq", "sentlist", "sentlistPrima", "sent", "asig", "exp", "expPrima", 
			"op", "oparit", "factor", "subparamlist", "explist", "explistPrima", 
			"proc_call", "write", "exprList", "writeArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'begin'", "'end'", "'.'", "'const'", "'='", 
			"'var'", "':'", "','", "'procedure'", "'function'", "'('", "')'", "'INTEGER'", 
			"'REAL'", "':='", "'+'", "'-'", "'*'", "'div'", "'mod'", "'writeln'", 
			"'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "CONSTINT", "CONSTREAL", "CONSTLIT", "COMENTARIO_LINEA", 
			"COMENTARIO_MULTILINEA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    String currentFunction = null;
	    int indentLevel = 0;
	    java.util.Map<String, String> symbolTable = new java.util.HashMap<>();

	    void println(String line) {
	        for (int i = 0; i < indentLevel; i++) System.out.print("    ");
	        System.out.println(line);
	    }

	    void print(String line) {
	        for (int i = 0; i < indentLevel; i++) System.out.print("    ");
	        System.out.print(line);
	    }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			match(ID);
			setState(74);
			match(T__1);

			    System.out.println("#include <stdio.h>\n");
			  
			setState(76);
			dcllist();

			    System.out.println();
			    println("int main() {");
			    indentLevel++;
			  
			setState(78);
			match(T__2);
			setState(79);
			sentlist();
			setState(80);
			match(T__3);
			setState(81);
			match(T__4);

			    println("return 0;");
			    indentLevel--;
			    println("}");
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistPrimaContext dcllistPrima() {
			return getRuleContext(DcllistPrimaContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				dcl();
				setState(85);
				dcllistPrima();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistPrimaContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistPrimaContext dcllistPrima() {
			return getRuleContext(DcllistPrimaContext.class,0);
		}
		public DcllistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistPrimaContext dcllistPrima() throws RecognitionException {
		DcllistPrimaContext _localctx = new DcllistPrimaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllistPrima);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				dcl();
				setState(91);
				dcllistPrima();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				defcte();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				defvar();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				defproc();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				deffun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefcteContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			ctelist();
			println("");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public Token ID;
		public SimpvalueContext simpvalue;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistPrimaContext ctelistPrima() {
			return getRuleContext(CtelistPrimaContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((CtelistContext)_localctx).ID = match(ID);
			setState(107);
			match(T__6);
			setState(108);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			setState(109);
			match(T__1);
			 println("#define " + (((CtelistContext)_localctx).ID!=null?((CtelistContext)_localctx).ID.getText():null) + " " + (((CtelistContext)_localctx).simpvalue!=null?_input.getText(((CtelistContext)_localctx).simpvalue.start,((CtelistContext)_localctx).simpvalue.stop):null)); 
			setState(111);
			ctelistPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistPrimaContext extends ParserRuleContext {
		public Token ID;
		public SimpvalueContext simpvalue;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistPrimaContext ctelistPrima() {
			return getRuleContext(CtelistPrimaContext.class,0);
		}
		public CtelistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistPrimaContext ctelistPrima() throws RecognitionException {
		CtelistPrimaContext _localctx = new CtelistPrimaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctelistPrima);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((CtelistPrimaContext)_localctx).ID = match(ID);
				setState(114);
				match(T__6);
				setState(115);
				((CtelistPrimaContext)_localctx).simpvalue = simpvalue();
				setState(116);
				match(T__1);
				 println("#define " + (((CtelistPrimaContext)_localctx).ID!=null?((CtelistPrimaContext)_localctx).ID.getText():null) + " " + (((CtelistPrimaContext)_localctx).simpvalue!=null?_input.getText(((CtelistPrimaContext)_localctx).simpvalue.start,((CtelistPrimaContext)_localctx).simpvalue.stop):null)); 
				setState(118);
				ctelistPrima();
				}
				break;
			case T__2:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode CONSTINT() { return getToken(gramaticaParser.CONSTINT, 0); }
		public TerminalNode CONSTREAL() { return getToken(gramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(gramaticaParser.CONSTLIT, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarContext extends ParserRuleContext {
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__7);
			setState(126);
			defvarlist();
			setState(127);
			match(T__1);
			println("");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarlistContext extends ParserRuleContext {
		public VarlistContext varlist;
		public TbasContext tbas;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistPrimaContext defvarlistPrima() {
			return getRuleContext(DefvarlistPrimaContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((DefvarlistContext)_localctx).varlist = varlist();
			setState(131);
			match(T__8);
			setState(132);
			((DefvarlistContext)_localctx).tbas = tbas();

			    String[] vars = (((DefvarlistContext)_localctx).varlist!=null?_input.getText(((DefvarlistContext)_localctx).varlist.start,((DefvarlistContext)_localctx).varlist.stop):null).split(",");
			    for (String var : vars) symbolTable.put(var.trim(), ((DefvarlistContext)_localctx).tbas.val);
			    println(((DefvarlistContext)_localctx).tbas.val + " " + (((DefvarlistContext)_localctx).varlist!=null?_input.getText(((DefvarlistContext)_localctx).varlist.start,((DefvarlistContext)_localctx).varlist.stop):null) + ";");

			setState(134);
			defvarlistPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarlistPrimaContext extends ParserRuleContext {
		public VarlistContext varlist;
		public TbasContext tbas;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistPrimaContext defvarlistPrima() {
			return getRuleContext(DefvarlistPrimaContext.class,0);
		}
		public DefvarlistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistPrimaContext defvarlistPrima() throws RecognitionException {
		DefvarlistPrimaContext _localctx = new DefvarlistPrimaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defvarlistPrima);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__1);
				setState(137);
				((DefvarlistPrimaContext)_localctx).varlist = varlist();
				setState(138);
				match(T__8);
				setState(139);
				((DefvarlistPrimaContext)_localctx).tbas = tbas();

				    String[] vars = (((DefvarlistPrimaContext)_localctx).varlist!=null?_input.getText(((DefvarlistPrimaContext)_localctx).varlist.start,((DefvarlistPrimaContext)_localctx).varlist.stop):null).split(",");
				    for (String var : vars) symbolTable.put(var.trim(), ((DefvarlistPrimaContext)_localctx).tbas.val);
				    println(((DefvarlistPrimaContext)_localctx).tbas.val + " " + (((DefvarlistPrimaContext)_localctx).varlist!=null?_input.getText(((DefvarlistPrimaContext)_localctx).varlist.start,((DefvarlistPrimaContext)_localctx).varlist.stop):null) + ";");

				setState(141);
				defvarlistPrima();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VarlistPrimaContext varlistPrima() {
			return getRuleContext(VarlistPrimaContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
			varlistPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistPrimaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VarlistPrimaContext varlistPrima() {
			return getRuleContext(VarlistPrimaContext.class,0);
		}
		public VarlistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistPrimaContext varlistPrima() throws RecognitionException {
		VarlistPrimaContext _localctx = new VarlistPrimaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varlistPrima);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__9);
				setState(150);
				match(ID);
				setState(151);
				varlistPrima();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefprocContext extends ParserRuleContext {
		public String fname;
		public Token ID;
		public Formal_paramlistContext fp;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__10);
			setState(156);
			((DefprocContext)_localctx).ID = match(ID);
			 ((DefprocContext)_localctx).fname =  (((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null); 
			setState(158);
			((DefprocContext)_localctx).fp = formal_paramlist();
			setState(159);
			match(T__1);
			 print("void " + _localctx.fname); print("(" + ((DefprocContext)_localctx).fp.text + ") {"); System.out.println(); indentLevel++; 
			setState(161);
			blq();
			setState(162);
			match(T__1);
			 indentLevel--; println("}"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeffunContext extends ParserRuleContext {
		public Token ID;
		public Formal_paramlistContext fname;
		public TbasContext rtype;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__11);
			setState(166);
			((DeffunContext)_localctx).ID = match(ID);
			setState(167);
			((DeffunContext)_localctx).fname = formal_paramlist();
			setState(168);
			match(T__8);
			setState(169);
			((DeffunContext)_localctx).rtype = tbas();
			setState(170);
			match(T__1);

			        currentFunction = (((DeffunContext)_localctx).ID!=null?((DeffunContext)_localctx).ID.getText():null);
			        print(((DeffunContext)_localctx).rtype.val + " " + currentFunction + "(" + ((DeffunContext)_localctx).fname.text + ") {");
			        System.out.println();
			        indentLevel++;
			        symbolTable.put(currentFunction, ((DeffunContext)_localctx).rtype.val);
			    
			setState(172);
			blq();
			setState(173);
			match(T__1);

			        indentLevel--;
			        println("}");
			        currentFunction = null;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public String text = "";
		public Formal_paramContext formal_param;
		public List<Formal_paramContext> params = new ArrayList<Formal_paramContext>();
		public List<Formal_paramContext> formal_param() {
			return getRuleContexts(Formal_paramContext.class);
		}
		public Formal_paramContext formal_param(int i) {
			return getRuleContext(Formal_paramContext.class,i);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formal_paramlist);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__12);
				setState(177);
				((Formal_paramlistContext)_localctx).formal_param = formal_param();
				((Formal_paramlistContext)_localctx).params.add(((Formal_paramlistContext)_localctx).formal_param);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(178);
					match(T__1);
					setState(179);
					((Formal_paramlistContext)_localctx).formal_param = formal_param();
					((Formal_paramlistContext)_localctx).params.add(((Formal_paramlistContext)_localctx).formal_param);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__13);

				        StringBuilder builder = new StringBuilder();
				        for (int i = 0; i < ((Formal_paramlistContext)_localctx).params.size(); i++) {
				            if (i > 0) builder.append(", ");
				            builder.append(((Formal_paramlistContext)_localctx).params.get(i).text);
				            // Registrar en symbolTable también si se desea
				        }
				        ((Formal_paramlistContext)_localctx).text =  builder.toString();
				    
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramlistContext)_localctx).text =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramContext extends ParserRuleContext {
		public String text;
		public VarlistContext vl;
		public TbasContext tb;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Formal_paramContext)_localctx).vl = varlist();
			setState(192);
			match(T__8);
			setState(193);
			((Formal_paramContext)_localctx).tb = tbas();

			        String[] vars = (((Formal_paramContext)_localctx).vl!=null?_input.getText(((Formal_paramContext)_localctx).vl.start,((Formal_paramContext)_localctx).vl.stop):null).split(",");
			        for (String var : vars) symbolTable.put(var.trim(), ((Formal_paramContext)_localctx).tb.val);
			        ((Formal_paramContext)_localctx).text =  ((Formal_paramContext)_localctx).tb.val + " " + (((Formal_paramContext)_localctx).vl!=null?_input.getText(((Formal_paramContext)_localctx).vl.start,((Formal_paramContext)_localctx).vl.stop):null);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramPrimaContext extends ParserRuleContext {
		public String text;
		public Formal_paramContext next;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_paramPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_paramPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_paramPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramPrimaContext formal_paramPrima() throws RecognitionException {
		Formal_paramPrimaContext _localctx = new Formal_paramPrimaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formal_paramPrima);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__1);
				setState(197);
				((Formal_paramPrimaContext)_localctx).next = formal_param();
				 ((Formal_paramPrimaContext)_localctx).text =  ", " + ((Formal_paramPrimaContext)_localctx).next.text; 
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramPrimaContext)_localctx).text =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public String val;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tbas);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__14);
				 ((TbasContext)_localctx).val =  "int"; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__15);
				 ((TbasContext)_localctx).val =  "float"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			dcllist();
			setState(210);
			match(T__2);
			setState(211);
			sentlist();
			setState(212);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPrimaContext sentlistPrima() {
			return getRuleContext(SentlistPrimaContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			sent();
			setState(215);
			sentlistPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistPrimaContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPrimaContext sentlistPrima() {
			return getRuleContext(SentlistPrimaContext.class,0);
		}
		public SentlistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistPrimaContext sentlistPrima() throws RecognitionException {
		SentlistPrimaContext _localctx = new SentlistPrimaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentlistPrima);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				sent();
				setState(218);
				sentlistPrima();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				asig();
				setState(224);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				proc_call();
				setState(227);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				write();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public Token ID;
		public ExpContext exp;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((AsigContext)_localctx).ID = match(ID);
			setState(233);
			match(T__16);
			setState(234);
			((AsigContext)_localctx).exp = exp();

			        if ((((AsigContext)_localctx).ID!=null?((AsigContext)_localctx).ID.getText():null).equals(currentFunction)) {
			            println("return " + (((AsigContext)_localctx).exp!=null?_input.getText(((AsigContext)_localctx).exp.start,((AsigContext)_localctx).exp.stop):null) + ";");
			        } else {
			            println((((AsigContext)_localctx).ID!=null?((AsigContext)_localctx).ID.getText():null) + " = " + (((AsigContext)_localctx).exp!=null?_input.getText(((AsigContext)_localctx).exp.start,((AsigContext)_localctx).exp.stop):null) + ";");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpPrimaContext expPrima() {
			return getRuleContext(ExpPrimaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			factor();
			setState(238);
			expPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpPrimaContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpPrimaContext expPrima() {
			return getRuleContext(ExpPrimaContext.class,0);
		}
		public ExpPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPrimaContext expPrima() throws RecognitionException {
		ExpPrimaContext _localctx = new ExpPrimaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expPrima);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				op();
				setState(241);
				factor();
				setState(242);
				expPrima();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			oparit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				simpvalue();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__12);
				setState(253);
				exp();
				setState(254);
				match(T__13);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(ID);
				setState(257);
				subparamlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subparamlist);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__12);
				setState(261);
				explist();
				setState(262);
				match(T__13);
				}
				break;
			case T__1:
			case T__9:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistPrimaContext explistPrima() {
			return getRuleContext(ExplistPrimaContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			exp();
			setState(268);
			explistPrima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistPrimaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistPrimaContext explistPrima() {
			return getRuleContext(ExplistPrimaContext.class,0);
		}
		public ExplistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplistPrima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplistPrima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistPrimaContext explistPrima() throws RecognitionException {
		ExplistPrimaContext _localctx = new ExplistPrimaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_explistPrima);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__9);
				setState(271);
				exp();
				setState(272);
				explistPrima();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			subparamlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public Token wtype;
		public ExprListContext exprList;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((WriteContext)_localctx).wtype = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
				((WriteContext)_localctx).wtype = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(T__12);
			setState(282);
			((WriteContext)_localctx).exprList = exprList();
			setState(283);
			match(T__13);
			setState(284);
			match(T__1);

			        StringBuilder format = new StringBuilder();
			        List<String> args = new ArrayList<>();

			        for (int i = 0; i < ((WriteContext)_localctx).exprList.values.size(); i++) {
			            String val = ((WriteContext)_localctx).exprList.values.get(i);
			            if (val.startsWith("'")) {
			                format.append(val.substring(1, val.length() - 1));
			            } else {
			                String type = symbolTable.getOrDefault(val, "int");
			                format.append(type.equals("float") ? "%f" : "%d");
			                args.add(val);
			            }
			        }

			        if ((((WriteContext)_localctx).wtype!=null?((WriteContext)_localctx).wtype.getText():null).equals("writeln")) format.append("\\n");

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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<String> values = new ArrayList<>();
		public ExpContext a;
		public ExpContext b;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((ExprListContext)_localctx).a = exp();
			 _localctx.values.add((((ExprListContext)_localctx).a!=null?_input.getText(((ExprListContext)_localctx).a.start,((ExprListContext)_localctx).a.stop):null)); 
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(289);
				match(T__9);
				setState(290);
				((ExprListContext)_localctx).b = exp();
				 _localctx.values.add((((ExprListContext)_localctx).b!=null?_input.getText(((ExprListContext)_localctx).b.start,((ExprListContext)_localctx).b.stop):null)); 
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteArgsContext extends ParserRuleContext {
		public String vlex;
		public Token a;
		public Token b;
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public List<TerminalNode> CONSTINT() { return getTokens(gramaticaParser.CONSTINT); }
		public TerminalNode CONSTINT(int i) {
			return getToken(gramaticaParser.CONSTINT, i);
		}
		public List<TerminalNode> CONSTREAL() { return getTokens(gramaticaParser.CONSTREAL); }
		public TerminalNode CONSTREAL(int i) {
			return getToken(gramaticaParser.CONSTREAL, i);
		}
		public List<TerminalNode> CONSTLIT() { return getTokens(gramaticaParser.CONSTLIT); }
		public TerminalNode CONSTLIT(int i) {
			return getToken(gramaticaParser.CONSTLIT, i);
		}
		public WriteArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWriteArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWriteArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWriteArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgsContext writeArgs() throws RecognitionException {
		WriteArgsContext _localctx = new WriteArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_writeArgs);
		 ((WriteArgsContext)_localctx).vlex =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((WriteArgsContext)_localctx).a = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				((WriteArgsContext)_localctx).a = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((WriteArgsContext)_localctx).vlex =  (((WriteArgsContext)_localctx).a!=null?((WriteArgsContext)_localctx).a.getText():null); 
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(300);
				match(T__9);
				setState(301);
				((WriteArgsContext)_localctx).b = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
					((WriteArgsContext)_localctx).b = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _localctx.vlex += "," + (((WriteArgsContext)_localctx).b!=null?((WriteArgsContext)_localctx).b.getText():null); 
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002_\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b5\b\u000f\n\u000f\f\u000f\u00b8"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00be"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ca"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d0"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00de\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e7\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00f6\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0103\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010a\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0114\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0126\b\"\n\"\f\"\u0129\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0005#\u0130\b#\n#\f#\u0133\t#\u0001#\u0000\u0000$\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDF\u0000\u0004\u0001\u0000\u001a\u001c\u0001\u0000"+
		"\u0012\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001c\u0126\u0000"+
		"H\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004^\u0001"+
		"\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000"+
		"\u0000\nj\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e{\u0001"+
		"\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000"+
		"\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000"+
		"\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000"+
		"\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000"+
		"\u0000\u0000 \u00bf\u0001\u0000\u0000\u0000\"\u00c9\u0001\u0000\u0000"+
		"\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d1\u0001\u0000\u0000\u0000("+
		"\u00d6\u0001\u0000\u0000\u0000*\u00dd\u0001\u0000\u0000\u0000,\u00e6\u0001"+
		"\u0000\u0000\u0000.\u00e8\u0001\u0000\u0000\u00000\u00ed\u0001\u0000\u0000"+
		"\u00002\u00f5\u0001\u0000\u0000\u00004\u00f7\u0001\u0000\u0000\u00006"+
		"\u00f9\u0001\u0000\u0000\u00008\u0102\u0001\u0000\u0000\u0000:\u0109\u0001"+
		"\u0000\u0000\u0000<\u010b\u0001\u0000\u0000\u0000>\u0113\u0001\u0000\u0000"+
		"\u0000@\u0115\u0001\u0000\u0000\u0000B\u0118\u0001\u0000\u0000\u0000D"+
		"\u011f\u0001\u0000\u0000\u0000F\u012a\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0001\u0000\u0000IJ\u0005\u0019\u0000\u0000JK\u0005\u0002\u0000\u0000"+
		"KL\u0006\u0000\uffff\uffff\u0000LM\u0003\u0002\u0001\u0000MN\u0006\u0000"+
		"\uffff\uffff\u0000NO\u0005\u0003\u0000\u0000OP\u0003(\u0014\u0000PQ\u0005"+
		"\u0004\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0006\u0000\uffff\uffff"+
		"\u0000S\u0001\u0001\u0000\u0000\u0000TU\u0003\u0006\u0003\u0000UV\u0003"+
		"\u0004\u0002\u0000VY\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000"+
		"\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0003\u0004\u0002\u0000\\_\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_\u0005\u0001\u0000\u0000\u0000`e\u0003\b\u0004"+
		"\u0000ae\u0003\u0010\b\u0000be\u0003\u001a\r\u0000ce\u0003\u001c\u000e"+
		"\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0006\u0000\u0000gh\u0003\n\u0005\u0000hi\u0006\u0004\uffff\uffff"+
		"\u0000i\t\u0001\u0000\u0000\u0000jk\u0005\u0019\u0000\u0000kl\u0005\u0007"+
		"\u0000\u0000lm\u0003\u000e\u0007\u0000mn\u0005\u0002\u0000\u0000no\u0006"+
		"\u0005\uffff\uffff\u0000op\u0003\f\u0006\u0000p\u000b\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0019\u0000\u0000rs\u0005\u0007\u0000\u0000st\u0003\u000e"+
		"\u0007\u0000tu\u0005\u0002\u0000\u0000uv\u0006\u0006\uffff\uffff\u0000"+
		"vw\u0003\f\u0006\u0000wz\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000"+
		"yq\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\r\u0001\u0000\u0000"+
		"\u0000{|\u0007\u0000\u0000\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005"+
		"\b\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0006\b\uffff\uffff\u0000\u0081\u0011\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u0084\u0005\t\u0000\u0000"+
		"\u0084\u0085\u0003$\u0012\u0000\u0085\u0086\u0006\t\uffff\uffff\u0000"+
		"\u0086\u0087\u0003\u0014\n\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0002\u0000\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a"+
		"\u008b\u0005\t\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u008d"+
		"\u0006\n\uffff\uffff\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0088"+
		"\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0015"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0019\u0000\u0000\u0093\u0094"+
		"\u0003\u0018\f\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\n\u0000\u0000\u0096\u0097\u0005\u0019\u0000\u0000\u0097\u009a\u0003\u0018"+
		"\f\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u000b\u0000\u0000\u009c\u009d\u0005\u0019\u0000"+
		"\u0000\u009d\u009e\u0006\r\uffff\uffff\u0000\u009e\u009f\u0003\u001e\u000f"+
		"\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1\u0006\r\uffff\uffff"+
		"\u0000\u00a1\u00a2\u0003&\u0013\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000"+
		"\u00a3\u00a4\u0006\r\uffff\uffff\u0000\u00a4\u001b\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00a7\u0005\u0019\u0000\u0000\u00a7"+
		"\u00a8\u0003\u001e\u000f\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa"+
		"\u0003$\u0012\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00ac\u0006"+
		"\u000e\uffff\uffff\u0000\u00ac\u00ad\u0003&\u0013\u0000\u00ad\u00ae\u0005"+
		"\u0002\u0000\u0000\u00ae\u00af\u0006\u000e\uffff\uffff\u0000\u00af\u001d"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\r\u0000\u0000\u00b1\u00b6\u0003"+
		" \u0010\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b5\u0003 \u0010"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bb\u0006\u000f\uffff"+
		"\uffff\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00be\u0006\u000f"+
		"\uffff\uffff\u0000\u00bd\u00b0\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003"+
		"\u0016\u000b\u0000\u00c0\u00c1\u0005\t\u0000\u0000\u00c1\u00c2\u0003$"+
		"\u0012\u0000\u00c2\u00c3\u0006\u0010\uffff\uffff\u0000\u00c3!\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000\u00c5\u00c6\u0003 \u0010"+
		"\u0000\u00c6\u00c7\u0006\u0011\uffff\uffff\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0006\u0011\uffff\uffff\u0000\u00c9\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca#\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u000f\u0000\u0000\u00cc\u00d0\u0006\u0012"+
		"\uffff\uffff\u0000\u00cd\u00ce\u0005\u0010\u0000\u0000\u00ce\u00d0\u0006"+
		"\u0012\uffff\uffff\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0%\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003"+
		"\u0002\u0001\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0003"+
		"(\u0014\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5\'\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000\u00d7\u00d8\u0003*\u0015\u0000"+
		"\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00da\u0003,\u0016\u0000\u00da\u00db"+
		"\u0003*\u0015\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de+\u0001\u0000\u0000\u0000\u00df\u00e0\u0003.\u0017"+
		"\u0000\u00e0\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0003@ \u0000\u00e3\u00e4\u0005\u0002\u0000\u0000\u00e4"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003B!\u0000\u00e6\u00df\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0019"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000\u00ea\u00eb\u00030\u0018"+
		"\u0000\u00eb\u00ec\u0006\u0017\uffff\uffff\u0000\u00ec/\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u00038\u001c\u0000\u00ee\u00ef\u00032\u0019\u0000\u00ef"+
		"1\u0001\u0000\u0000\u0000\u00f0\u00f1\u00034\u001a\u0000\u00f1\u00f2\u0003"+
		"8\u001c\u0000\u00f2\u00f3\u00032\u0019\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f63\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u00036\u001b\u0000\u00f85\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0007\u0001\u0000\u0000\u00fa7\u0001\u0000\u0000\u0000\u00fb\u0103\u0003"+
		"\u000e\u0007\u0000\u00fc\u00fd\u0005\r\u0000\u0000\u00fd\u00fe\u00030"+
		"\u0018\u0000\u00fe\u00ff\u0005\u000e\u0000\u0000\u00ff\u0103\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005\u0019\u0000\u0000\u0101\u0103\u0003:\u001d"+
		"\u0000\u0102\u00fb\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u01039\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\r\u0000\u0000\u0105\u0106\u0003<\u001e\u0000\u0106"+
		"\u0107\u0005\u000e\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u010a;\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u00030\u0018\u0000\u010c\u010d\u0003>\u001f\u0000\u010d=\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\n\u0000\u0000\u010f\u0110\u00030\u0018"+
		"\u0000\u0110\u0111\u0003>\u001f\u0000\u0111\u0114\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u0114?\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u0019\u0000\u0000\u0116\u0117\u0003:\u001d\u0000\u0117A\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0007\u0002\u0000\u0000\u0119\u011a\u0005"+
		"\r\u0000\u0000\u011a\u011b\u0003D\"\u0000\u011b\u011c\u0005\u000e\u0000"+
		"\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d\u011e\u0006!\uffff\uffff"+
		"\u0000\u011eC\u0001\u0000\u0000\u0000\u011f\u0120\u00030\u0018\u0000\u0120"+
		"\u0127\u0006\"\uffff\uffff\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122"+
		"\u0123\u00030\u0018\u0000\u0123\u0124\u0006\"\uffff\uffff\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128E\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0003\u0000\u0000\u012b\u0131"+
		"\u0006#\uffff\uffff\u0000\u012c\u012d\u0005\n\u0000\u0000\u012d\u012e"+
		"\u0007\u0003\u0000\u0000\u012e\u0130\u0006#\uffff\uffff\u0000\u012f\u012c"+
		"\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132G\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0012X^dy\u0090"+
		"\u0099\u00b6\u00bd\u00c9\u00cf\u00dd\u00e6\u00f5\u0102\u0109\u0113\u0127"+
		"\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}