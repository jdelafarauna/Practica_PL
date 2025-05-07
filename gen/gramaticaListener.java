// Generated from /Users/josedelafuente/Desktop/Practica_PL/src/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist_aux}.
	 * @param ctx the parse tree
	 */
	void enterCtelist_aux(gramaticaParser.Ctelist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist_aux}.
	 * @param ctx the parse tree
	 */
	void exitCtelist_aux(gramaticaParser.Ctelist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#defvarlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist_aux(gramaticaParser.Defvarlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvarlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist_aux(gramaticaParser.Defvarlist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#varlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterVarlist_aux(gramaticaParser.Varlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitVarlist_aux(gramaticaParser.Varlist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#formal_paramlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist_aux(gramaticaParser.Formal_paramlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_paramlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist_aux(gramaticaParser.Formal_paramlist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist_aux}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_aux(gramaticaParser.Sentlist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist_aux}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_aux(gramaticaParser.Sentlist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#exp_aux}.
	 * @param ctx the parse tree
	 */
	void enterExp_aux(gramaticaParser.Exp_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_aux}.
	 * @param ctx the parse tree
	 */
	void exitExp_aux(gramaticaParser.Exp_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#oprel}.
	 * @param ctx the parse tree
	 */
	void enterOprel(gramaticaParser.OprelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#oprel}.
	 * @param ctx the parse tree
	 */
	void exitOprel(gramaticaParser.OprelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opbool}.
	 * @param ctx the parse tree
	 */
	void enterOpbool(gramaticaParser.OpboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opbool}.
	 * @param ctx the parse tree
	 */
	void exitOpbool(gramaticaParser.OpboolContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#explist_aux}.
	 * @param ctx the parse tree
	 */
	void enterExplist_aux(gramaticaParser.Explist_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explist_aux}.
	 * @param ctx the parse tree
	 */
	void exitExplist_aux(gramaticaParser.Explist_auxContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(gramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(gramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cond_else}.
	 * @param ctx the parse tree
	 */
	void enterCond_else(gramaticaParser.Cond_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cond_else}.
	 * @param ctx the parse tree
	 */
	void exitCond_else(gramaticaParser.Cond_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(gramaticaParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(gramaticaParser.BucleContext ctx);
}