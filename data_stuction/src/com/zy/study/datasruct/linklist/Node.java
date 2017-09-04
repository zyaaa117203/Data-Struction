package com.zy.study.datasruct.linklist;

public class Node<T> {

	T data;
	Node<T> next;

	// 几个概念
	// 头结点(不是必须的) 头结点是为了操作的统一与方便而设立的，放在第一个元素结点之前，
	// 其数据域一般无意义（当然有些情况下也可存放链表的长度、用做监视哨等等）。
	// 头指针， 链表中第一个结点的存储位置叫做头指针”，如果链表有头结点，那么头指针就是指向头结点数据域的指针
	// 如果没有，头指针就是指向首元结点的，首元结点就是链表的第一个元素的结点

	// 头结点的好处
	// 头结点即在链表的首元结点之前附设的一个结点，该结点的数据域中不存储线性表的数据元素，其作用是为了对链表进行操作时，
	// 可以对空表、非空表的情况以及对首元结点进行统一处理，编程更方便。

	// 如何表示空表：
	// 无头结点时，当头指针的值为空时表示空表； 有头结点时，当头结点的指针域为空时表示空表。

	// 头结点的数据域内装的是什么？
	// 头结点的数据域可以为空，也可存放线性表长度等附加信息，但此结点不能计入链表长度值。

	// 构造头结点
	public Node(Node<T> next) {
		this.next = next;
	}

	// 普通结点构造器
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if (this.data == null) {
			return null;
		}
		return this.data.toString();
	}

}
