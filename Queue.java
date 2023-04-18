public class Queue<E> {
    private class Node {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        } else {
            Node current = head;
            head = head.next;
            current.next = null;
            return current.data;
        }

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

    public E head() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        }
        return head.data;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty List";
        }
        String result = "";
        Node current = head;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }

}
