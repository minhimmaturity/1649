public class App {
    
    public static void main(String[] args) {
        try {
            Stack<Integer> list = new Stack<Integer>();
            list.push(1);
            list.push(2);
            list.push(3);
            System.out.println("Stack: " + list.toString());
            System.out.println("Size: " + list.size());

            System.out.println("Pop: " + list.pop());
            System.out.println("Stack after pop: " + list.toString());
            System.out.println("Size after pop: " + list.size());

            System.out.println("/////////////////////////");

            Queue<Integer> queue = new Queue<Integer>();
            // queue.enqueue(3);
            // queue.enqueue(2);
            // queue.enqueue(5);
            System.out.println("Queue: " + queue.toString());

            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("After dequeue: " + queue.toString());
            System.out.println("Head: " + queue.head());

            queue.enqueue(10);
            System.out.println("After enqueue: " + queue.toString());
            // Queue queue1 = new Queue();

            // System.out.println("Pop: " + list.pop());
            // System.out.println("After pop: " + list.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        // System.out.println("Start Linked List: " + list.toString());

        // System.out.println("Peek: " + list.peek());
        // System.out.println("After peek: " + list.toString());

        // // list.push(3);
        // // System.out.println("After push: " + list.toString());

    }
}