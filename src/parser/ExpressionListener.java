// Generated from C:/Users/Computer/IdeaProjects/MT_Task3/src/parser\Expression.g4 by ANTLR 4.7.2
package parser;

  import entities.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ExpressionParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ExpressionParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExpressionParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExpressionParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mAssign}.
	 * @param ctx the parse tree
	 */
	void enterMAssign(ExpressionParser.MAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mAssign}.
	 * @param ctx the parse tree
	 */
	void exitMAssign(ExpressionParser.MAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#arithmExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmExpression(ExpressionParser.ArithmExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arithmExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmExpression(ExpressionParser.ArithmExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(ExpressionParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(ExpressionParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#reading}.
	 * @param ctx the parse tree
	 */
	void enterReading(ExpressionParser.ReadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#reading}.
	 * @param ctx the parse tree
	 */
	void exitReading(ExpressionParser.ReadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#printing}.
	 * @param ctx the parse tree
	 */
	void enterPrinting(ExpressionParser.PrintingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#printing}.
	 * @param ctx the parse tree
	 */
	void exitPrinting(ExpressionParser.PrintingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void enterWhileCycle(ExpressionParser.WhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void exitWhileCycle(ExpressionParser.WhileCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ExpressionParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ExpressionParser.PredicateContext ctx);
}