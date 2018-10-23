package org.leafeq.exercise.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 *  变量解析器
 * @author tazui
 *
 */
public class VarExpression extends Expression{
	
	
	private String key;
	public VarExpression(String _key) {
		this.key = _key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
