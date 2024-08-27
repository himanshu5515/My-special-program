import java.util.Stack;

public class Push_At_bottam {
    public static void psuhbottam(Stack<Integer> hs, int data) {
        Stack<Integer> h = new Stack<>();
        while (!hs.empty()) {
            h.push(hs.pop());
        }
        hs.push(data);
        while(!h.empty()){
            hs.push(h.pop());
        }
        while(!hs.empty()){
            System.out.println(hs.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> hs=new Stack<>();
        hs.push(1);
        hs.push(2);
        hs.push(3);
        psuhbottam(hs,4);
    }
}
