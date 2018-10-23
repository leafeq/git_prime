package org.leafeq.exercise.patterns.behavioral.interpreter;

/**
 * 抽象运算符号解析器
 * @author tazui
 *
 */
public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;
		
	//所有解析公式都应只关心自己左右两个表达式的结果
	public SymbolExpression(Expression _left,Expression _right) {
		this.left = _left;
		this.right = _right;
	}
}
