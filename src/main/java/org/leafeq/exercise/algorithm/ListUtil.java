package org.leafeq.exercise.algorithm;

import java.util.ArrayList;
import java.util.List;

public abstract class ListUtil<T> {

	/**
	 * list合并算法
	 * 
	 * @param firstList
	 * @param nextList
	 * @return
	 */
	public List<T> combinList(List<T> firstList, List<T> nextList) {
		List<T> targetList = new ArrayList<>();
		int firstSize = getSize(firstList);
		int nextSize = getSize(nextList);
		int totalSize = firstSize + nextSize;
		if (totalSize == firstSize) { // 返回不为空的list
			return firstList;
		} else if (totalSize == nextSize) { // 返回不为空的list
			return nextList;
		} else {
			for(T first: firstList) {
				for(T next: nextList){
					targetList.add(first);
					boolean resCompare = rule(first, next);       //对比对象是否相同
					if(!resCompare) {
						targetList.add(next);
					}
				}
			}
		}
		return targetList;

	}

	/**
	 * 获取list长度
	 * 
	 * @param targetList
	 * @return
	 */
	private int getSize(List<T> targetList) {
		return null == targetList ? 0 : targetList.size();
	}

	/**
	 * 判断规则
	 * 
	 * @return true:相同 false:不相同
	 */
	public abstract boolean rule(T t1, T t2);
}
