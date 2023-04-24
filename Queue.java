public class Queue<E> {
    private class Node {
        E data;
        Node next;
        Node prev;

        public Node(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node first;
    public Node last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public int max = 20;

    public E enqueue(E data) {
        Node newNode = new Node(data);
        if(size() > max) {
            throw new RuntimeException("Queue Overflow");
        } else if (last == null) {
            last = newNode;
            first = newNode;
            return last.data;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            return last.prev.data;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        } else {
            E x = first.data;
            first = first.next;
            first.prev = null;
            return x;
        }

    }

    public int size() {
        int count = 0;
        Node current = first;
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
        return first.data;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty List";
        }
        String result = "";
        Node current = first;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }

}
