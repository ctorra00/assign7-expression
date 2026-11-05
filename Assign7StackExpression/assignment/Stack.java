package assignment;

import java.util.EmptyStackException;

public class Stack<T> extends LinkedList<T> implements StackInterface<T> {
    private int count = 0;

    public void push(T item) {
        Node<T> newNode = new Node<T>(item);
        newNode.next = this.HEAD;
        if (this.HEAD != null) {
            this.HEAD.prev = newNode;
        } else {
            this.TAIL = newNode;
        }
        this.HEAD = newNode;
        count++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = this.HEAD.item;
        this.HEAD = this.HEAD.next;
        if (this.HEAD != null) {
            this.HEAD.prev = null;
        } else {
            this.TAIL = null;
        }
        count--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.HEAD.item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}