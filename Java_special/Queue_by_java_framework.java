import java.util.*;
public class Queue_by_java_framework {
    public static void main(String[] args) {
        Queue<Integer> hs=new LinkedList<>(); //
         hs.add(1);
         hs.add(2);
         hs.add(3);

         while(!hs.isEmpty()){
             System.out.println(hs.peek());
             hs.remove();
         }
    }

}
