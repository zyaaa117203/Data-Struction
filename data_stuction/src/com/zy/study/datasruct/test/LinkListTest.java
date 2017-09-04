package com.zy.study.datasruct.test;

import com.zy.study.datasruct.linklist.LinkList;
import com.zy.study.datasruct.linklist.LinkListException;

public class LinkListTest {

	public static void main(String[] args) throws LinkListException {
		LinkList<Integer> list = new LinkList<>();
		// System.out.println(list);
		// list.deleteEle(0);
		for (int i = 0; i < 10; i++) {
			int temp = ((int) (Math.random() * 100)) % 100;
			list.insertEle(i, temp);
		}
		for (int i = 0; i < list.size; i++) {
			System.out.println(list.getEleByIndex(i));
		}
		System.out.println(list);
		list.deleteEle(9);
		System.out.println(list);
	}

}
