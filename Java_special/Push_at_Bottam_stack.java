import java.util.Stack;

public class Push_at_Bottam_stack {
public static void pushatbottam(Stack<Integer>hs, int data){
    if(hs.empty()){
        hs.push(data);
        return;
    }
    int top=hs.pop();
    pushatbottam(hs,data);

    hs.push(top);
}

    public static void main(String[] args) {
        Stack<Integer> hs=new Stack<>();
        hs.push(1);
        hs.push(2);
        hs.push(3);
        pushatbottam(hs,4);

        while(!hs.empty()){
            System.out.print(hs.pop()+" ");
        }
    }
}
