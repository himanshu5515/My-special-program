import java.util.Stack;

public class Reverse_polish_notation {
    public static int reverse_polish_notaton(String arr[]){
        int total_ans=0;
        Stack<Integer>hs=new Stack<>();
        int d1=0;
        int d2=0;
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=="+" ){
                d2=hs.pop();
                d1=hs.pop();
                ans=d1+d2;
                hs.push(ans);}
            else if (arr[i]=="-") {
                d2=hs.pop();
                d1=hs.pop();
                ans=d1-d2;
                hs.push(ans); }
            else if (arr[i]=="*") {
                d2=hs.pop();
                d1=hs.pop();
                ans=d1*d2;
                hs.push(ans);}
            else if (arr[i]=="/") {
                d2=hs.pop();
                d1=hs.pop();
                ans=d1/d2;
                hs.push(ans); }
            else {
                hs.add(Integer.parseInt(arr[i]));
            }
        }
        return hs.pop();
    }
    public static void main(String[] args) {
        String  arr[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(reverse_polish_notaton(arr));
    }
}