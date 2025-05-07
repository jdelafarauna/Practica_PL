// Generated from C:/Users/jdela/IdeaProjects/Practica_PL/src/gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcllistPrima}.
	 * @param ctx the parse tree
	 */
	void enterDcllistPrima(gramaticaParser.DcllistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcllistPrima}.
	 * @param ctx the parse tree
	 */
	void exitDcllistPrima(gramaticaParser.DcllistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(gramaticaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(gramaticaParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(gramaticaParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelistPrima}.
	 * @param ctx the parse tree
	 */
	void enterCtelistPrima(gramaticaParser.CtelistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelistPrima}.
	 * @param ctx the parse tree
	 */
	void exitCtelistPrima(gramaticaParser.CtelistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(gramaticaParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(gramaticaParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(gramaticaParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(gramaticaParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvarlistPrima}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlistPrima(gramaticaParser.DefvarlistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvarlistPrima}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlistPrima(gramaticaParser.DefvarlistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlistPrima}.
	 * @param ctx the parse tree
	 */
	void enterVarlistPrima(gramaticaParser.VarlistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlistPrima}.
	 * @param ctx the parse tree
	 */
	void exitVarlistPrima(gramaticaParser.VarlistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(gramaticaParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(gramaticaParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(gramaticaParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(gramaticaParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(gramaticaParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(gramaticaParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_paramPrima}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramPrima(gramaticaParser.Formal_paramPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_paramPrima}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramPrima(gramaticaParser.Formal_paramPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlistPrima}.
	 * @param ctx the parse tree
	 */
	void enterSentlistPrima(gramaticaParser.SentlistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlistPrima}.
	 * @param ctx the parse tree
	 */
	void exitSentlistPrima(gramaticaParser.SentlistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(gramaticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(gramaticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expPrima}.
	 * @param ctx the parse tree
	 */
	void enterExpPrima(gramaticaParser.ExpPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expPrima}.
	 * @param ctx the parse tree
	 */
	void exitExpPrima(gramaticaParser.ExpPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(gramaticaParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(gramaticaParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#explistPrima}.
	 * @param ctx the parse tree
	 */
	void enterExplistPrima(gramaticaParser.ExplistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explistPrima}.
	 * @param ctx the parse tree
	 */
	void exitExplistPrima(gramaticaParser.ExplistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(gramaticaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(gramaticaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(gramaticaParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(gramaticaParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#writeArgs}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgs(gramaticaParser.WriteArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#writeArgs}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgs(gramaticaParser.WriteArgsContext ctx);
}