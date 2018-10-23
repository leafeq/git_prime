package org.leafeq.exercise.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * 解析器
 * @author tazui
 *
 */
public abstract class Expression {
	
	//解析公式和数值，其中var中的key值是公式中的参数，value值是具体的参数
	public abstract int interpreter(HashMap<String, Integer> var);
}
