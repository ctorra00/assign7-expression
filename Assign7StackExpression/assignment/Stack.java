package assignment;
import assignment.Node;
import assignment.LinkedList;

public class Stack<T> extends LinkedList implements StackInterface<T>{

	
	public void push (T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = this.HEAD;
		this.HEAD = newNode;
	}
	
	public T pop() {
		
	}
	
	public T peek() {
		
	}
	
	public boolean isEmpty() {
		
	}
	
	public int size() {
		
	}
}
