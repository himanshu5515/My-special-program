import java.beans.Introspector;
import java.util.Stack;

public class Reverse_a_stack {
    public static void pushatbottam(Stack<Integer>hs, int data){
        if(hs.empty()){
            hs.push(data);
            return;
        }
        int top=hs.pop();
        pushatbottam(hs,data);
        hs.push(top);
    }
    public static void reversestack(Stack<Integer> hs){
        if(hs.empty()){
            return;}

      int top=hs.pop();
      reversestack(hs);
     pushatbottam(hs,top);
    }
    public static void print(Stack<Integer> hs){
        while(!hs.empty()){
            System.out.print(hs.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> hs=new Stack<>();
        hs.push(1);
        hs.push(2);
        hs.push(3);
        hs.push(4);


        reversestack(hs);
        print(hs);



    }
}
