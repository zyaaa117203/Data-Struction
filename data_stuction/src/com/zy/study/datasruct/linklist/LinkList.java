package com.zy.study.datasruct.linklist;

public class LinkList<T> implements IList<T> {

	private Node<T> head;
	private Node<T> current;// 当前结点对象
	public int size;// 链表长度

	public LinkList() {
		// 初始化头结点，让头指针指向头结点 设置当前结点为头结点
		this.head = current = new Node<T>(null);
		this.size = 0;

	}

	// 定位，将当前结点定位到需要操作结点的前一个结点
	// 比如我们要在n3之前做插入，那么我们要找到n2这个结点，修改其指针域指向新插入的结点
	public void index(int index) throws LinkListException {
		if (index < -1 || index > size - 1) {
			throw new LinkListException("Param Not Valid", "indexNotValid");
		}
		if (index == -1)// 头结点
			return;
		// 从头结点之后的第一个结点开始定位
		current = head.next;
		int j = 0;// 循环变量
		while (current != null && j < index) {
			current = current.next;
			j++;
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void insertEle(int index, T element) throws LinkListException {
		if (index < 0 || index > size) {
			throw new LinkListException("Param Not Valid", "indexNotValid");
		}
		index(index - 1);
		current.setNext(new Node<T>(element, current.next));
		size++;
	}

	@Override
	public void deleteEle(int index) throws LinkListException {
		if (isEmpty()) {
			throw new LinkListException("List is null,can not delete param", "linkListIsNull");
		}
		if (index < 0 || index > size) {
			throw new LinkListException("Param Not Valid", "indexNotValid");
		}
		// 定位到前一个结点
		index(index - 1);
		// 让前一个结点的指针指向下下个结点
		current.setNext(current.next.next);
		size--;
	}

	@Override
	public T getEleByIndex(int index) throws LinkListException {
		if (index < -1 || index > size - 1) {
			throw new LinkListException("Param Not Valid", "indexNotValid");
		}
		index(index - 1);
		return current.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;

	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (size == 0) {
			return sb.append("[").append("]").toString();
		}
		try {
			for (int i = 0; i < size; i++) {
				sb.append(this.getEleByIndex(i)).append(",");
			}
		} catch (LinkListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new StringBuffer().append("[").append(sb.substring(0, sb.length() - 1)).append("]").toString();
	}
}
