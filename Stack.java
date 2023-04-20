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

    public E push(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return newNode.data;
        } else {
            newNode.next = head;
            head = newNode;
            return head.data;
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

    /**
     * 
     * @return top of the stack
     */
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List");
        }
        return head.data;
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
