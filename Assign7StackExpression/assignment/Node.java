package assignment;

public class Node<T> {
	protected T item;
	Node<T> next;
	Node<T> prev;
	
	
	public Node() {}
	
	public Node(T item) {
		this.item=item;
		this.next=null;
		this.prev=null;
	}
}