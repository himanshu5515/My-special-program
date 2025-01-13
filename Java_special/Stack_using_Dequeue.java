import java.util.*;
import java.util.Deque;

public class Stack_using_Dequeue {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();

        public void pushs(int data){
         deque.addLast(data); }

        public int  peeks(){
            return deque.getLast();
        }
        public int pops(){
            return deque.removeLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pushs(1);
        stack.pushs(2);
        stack.pushs(3);

        while(!stack.deque.isEmpty()){
            System.out.print(stack.peeks()+" ");
            stack.pops();
        }

    }
}