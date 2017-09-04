package com.zy.study.datasruct.linklist;

public class LinkList<T> implements IList<T> {

	private Node<T> head;
	private Node<T> current;// ��ǰ������
	public int size;// ������

	public LinkList() {
		// ��ʼ��ͷ��㣬��ͷָ��ָ��ͷ��� ���õ�ǰ���Ϊͷ���
		this.head = current = new Node<T>(null);
		this.size = 0;

	}

	// ��λ������ǰ��㶨λ����Ҫ��������ǰһ�����
	// ��������Ҫ��n3֮ǰ�����룬��ô����Ҫ�ҵ�n2�����㣬�޸���ָ����ָ���²���Ľ��
	public void index(int index) throws LinkListException {
		if (index < -1 || index > size - 1) {
			throw new LinkListException("Param Not Valid", "indexNotValid");
		}
		if (index == -1)// ͷ���
			return;
		// ��ͷ���֮��ĵ�һ����㿪ʼ��λ
		current = head.next;
		int j = 0;// ѭ������
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
		// ��λ��ǰһ�����
		index(index - 1);
		// ��ǰһ������ָ��ָ�����¸����
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
