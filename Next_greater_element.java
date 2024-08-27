import java.util.Stack;

public class Next_greater_element {


    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> hs=new Stack<>();
        int nextgreater[]=new int[arr.length];


        for(int i=arr.length-1; i>=0; i--){

            while(!hs.empty() && arr[hs.peek()]<=arr[i]){
                hs.pop();
            }
            if(hs.empty()){
                nextgreater[i]=-1;
            }
            else {
                nextgreater[i]=arr[hs.peek()];
            }
            hs.push(i);
        }
        for(int i=0; i<nextgreater.length; i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}
