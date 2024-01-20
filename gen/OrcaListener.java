// Generated from C:/Users/Ben/Desktop/Solidity/src\Orca.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OrcaParser}.
 */
public interface OrcaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OrcaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OrcaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrcaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OrcaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrcaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(OrcaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrcaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(OrcaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrcaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OrcaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrcaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OrcaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(OrcaParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(OrcaParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(OrcaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(OrcaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OrcaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link OrcaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OrcaParser.ConstantContext ctx);
}