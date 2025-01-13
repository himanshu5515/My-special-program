import java.util.Queue;
import java.util.Stack;

public class Queue_using_2_stack {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isempty(){
            return s1.isEmpty();
        }
        // add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        // peek
        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue hs=new Queue();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        while (!hs.isempty()){
            System.out.println(hs.peek());
            hs.remove();
        }
    }
}
