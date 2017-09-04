package com.zy.study.datasruct.linklist;

public interface IList<T> {
	int getSize();

	void insertEle(int index, T element) throws LinkListException;

	void deleteEle(int index) throws LinkListException;

	T getEleByIndex(int index) throws LinkListException;

	boolean isEmpty();

}
