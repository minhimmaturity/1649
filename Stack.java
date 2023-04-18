public class Stack<E> {
    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public Stack() {
        this.head = null;
    }

    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void push(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * @return the head of the list
     */
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        } else {
            Node current = head;
            head = head.next;
            current.next = null;
            return current.data;
        }
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        }
        return head.data;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isEmpty()) {
            return null;
        } else {
            String result = "";
            Node current = head;
            while (current != null) {
                result += current.data + " ";
                current = current.next;
            }
            return result;
        }
    }
}
