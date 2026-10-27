package assignment;
import assignment.Node;

public class LinkedList<T> {
	protected Node<T> HEAD;
	protected Node<T> TAIL;
	
	public LinkedList() {
		this.HEAD=null;
		this.TAIL = null;
	}
	
	public void append(T item) {
		Node<T> newNode = new Node<T>(item);
		Node<T> curNode = this.HEAD;
		if(this.HEAD==null) {
			this.HEAD=newNode;
		}else {
			while(curNode.next!=null) {
				curNode=curNode.next;
			}
			curNode.next=newNode;
		}
	}
	
	public void appendWithTail(T item) {
		Node<T> newNode = new Node<T>(item);
		if (this.HEAD==null) {
			this.HEAD=newNode;
		}
		if (this.TAIL==null) {
			this.TAIL=newNode;
		}
		this.TAIL.next=newNode;
		this.TAIL=newNode;
		
	}
	
	public Node<T> Search(T item) {
		if (this.HEAD == null) {
			return null;
		}
		if (this.TAIL == null) {
			return null;
		}
		Node<T> curNode = this.HEAD;
		while(curNode.next != null) {
			if (curNode.item == item) {
				return curNode;
			}
		}
		return null;
	}
	
	public Node<T> delete(T item) {		
		Node<T> result=null;
		Node<T> curNode = this.HEAD;
		Node<T> prevNode = this.HEAD;
		if(this.HEAD.item == item) {
			result = this.HEAD;
			this.HEAD = this.HEAD.next;
		}else {
			while(curNode!=null) {
				if(curNode.item == item) {
					result = curNode;
					prevNode.next = curNode.next;
					if(prevNode.next!=null) {
						this.TAIL = prevNode.next;
					}else {
						this.TAIL = prevNode;
					}
					break;
				}
				prevNode=curNode;
				curNode=curNode.next;
			}
		}
		return result;
	}
	
	public void show() {
		Node<T> curNode = this.HEAD;
		while(curNode!=null) {
			System.out.printf("----%s------\n", curNode.toString());
			System.out.printf("Value: %d - Next: %h\n", curNode.item,curNode.next);
			curNode=curNode.next;
		}
	}
}