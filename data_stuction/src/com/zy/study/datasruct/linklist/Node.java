package com.zy.study.datasruct.linklist;

public class Node<T> {

	T data;
	Node<T> next;

	// ��������
	// ͷ���(���Ǳ����) ͷ�����Ϊ�˲�����ͳһ�뷽��������ģ����ڵ�һ��Ԫ�ؽ��֮ǰ��
	// ��������һ�������壨��Ȼ��Щ�����Ҳ�ɴ������ĳ��ȡ����������ڵȵȣ���
	// ͷָ�룬 �����е�һ�����Ĵ洢λ�ý���ͷָ�롱�����������ͷ��㣬��ôͷָ�����ָ��ͷ����������ָ��
	// ���û�У�ͷָ�����ָ����Ԫ���ģ���Ԫ����������ĵ�һ��Ԫ�صĽ��

	// ͷ���ĺô�
	// ͷ��㼴���������Ԫ���֮ǰ�����һ����㣬�ý����������в��洢���Ա������Ԫ�أ���������Ϊ�˶�������в���ʱ��
	// ���ԶԿձ��ǿձ������Լ�����Ԫ������ͳһ������̸����㡣

	// ��α�ʾ�ձ�
	// ��ͷ���ʱ����ͷָ���ֵΪ��ʱ��ʾ�ձ� ��ͷ���ʱ����ͷ����ָ����Ϊ��ʱ��ʾ�ձ�

	// ͷ������������װ����ʲô��
	// ͷ�������������Ϊ�գ�Ҳ�ɴ�����Ա��ȵȸ�����Ϣ�����˽�㲻�ܼ���������ֵ��

	// ����ͷ���
	public Node(Node<T> next) {
		this.next = next;
	}

	// ��ͨ��㹹����
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
