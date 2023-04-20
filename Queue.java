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

    public E enqueue(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return head.data;
        } else {
            tail.next = newNode;
            tail = newNode;
            return tail.data;
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


    public E addElementByIndex(int index, E data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
            return newNode.data;
        } else if(index > size()) {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            current = newNode;
            // tail.next = newNode;
            // tail = newNode;
            return current.data;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
            return head.data;
        } else {
            Node current = head;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return current.data;
        }
    }

    public E removeElementByIndex(int index) {
        if(index < 0 || isEmpty()) {
            throw new IllegalArgumentException("index must be positive");
        } else if (index > size()) {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            E x = current.next.data;
            current.next = null;
            return x;
        } else if (index == 0) {
            E x = head.data;
            head = head.next;
            head = null;
            return x;
        } else {
            Node current = head;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            E x = current.next.data;
            current.next = current.next.next;
            return x;
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
