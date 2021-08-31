package oop;

public class StackList<E> implements List<E> {
	
	class Node {
		Node next;
		E element;
	}
	
	Node list;
	
	public StackList(){
		list = null;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.element = e;
		node.next = list;
		list = node;
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(list != null) {
			E e = list.element;
			list = list.next;
			return e;
		}
		else {
			return null;
		}
	}
	

}
