import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_2_queue {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isempty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            // Add to non-empty queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isempty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            // Move elements from q1 to q2 except the last one
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove(); // Remove and get the last element
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove(); // Remove and get the last element
            }

            return top;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            // Move elements from q1 to q2 except the last one
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        // Peek and pop elements from stack
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
