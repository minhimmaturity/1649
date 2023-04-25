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

    int Max = 20;

    public E push(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return newNode.data;
        } else if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return newNode.data;
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
            while (current.next.next != null) {
                current = current.next;
            }
            E x = current.next.data;
            current.next = null;
            return x;
        }
    }

    /**
     * 
     * @return top of the stack
     */
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * 
     * @return the size of the stack
     */
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * @return check if the stack is empty or not,
    *  return boolean value,
    *
    true is empty, false is not
     */
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(size() > Max) {
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
