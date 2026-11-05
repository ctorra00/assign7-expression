package assignment;

public class LinkedList<T> {
    protected Node<T> HEAD;
    protected Node<T> TAIL;

    public LinkedList() {
        HEAD = null;
        TAIL = null;
    }

    public void append(T item) {
        appendWithTail(item);
    }

    public void appendWithTail(T item) {
        Node<T> newNode = new Node<T>(item);
        if (HEAD == null) {
            HEAD = newNode;
            TAIL = newNode;
        } else {
            TAIL.next = newNode;
            newNode.prev = TAIL;
            TAIL = newNode;
        }
    }

    public Node<T> Search(T item) {
        Node<T> current = HEAD;
        while (current != null) {
            if (java.util.Objects.equals(current.item, item)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node<T> delete(T item) {
        Node<T> current = Search(item);
        if (current == null) {
            return null;
        }
        if (current.prev == null) {
            HEAD = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            TAIL = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        current.next = null;
        current.prev = null;
        return current;
    }

    public void show() {
        Node<T> current = HEAD;
        while (current != null) {
            System.out.println("Value: " + current.item);
            current = current.next;
        }
    }
}