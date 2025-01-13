import java.util.Stack;

public class Stock_span_problem {
public static void stockspan(int stock[],int span[]){
    Stack<Integer> hs=new Stack<>();
    span[0]=1;
    hs.push(0);

    for(int i=1; i<stock.length; i++){
        int currpeice=stock[i];
        while(!hs.empty() && currpeice>stock[hs.peek()]){
            hs.pop();
        }
        if(hs.isEmpty()){
            span[i]=i+1;
        }
        else {
            int prevhigh=hs.peek();
            span[i]=i-prevhigh;
        }
        hs.push(i);
    }
}
    public static void main(String[] args) {
        int stock[]={7,1,5,3,6,4};
        int span[]=new int[stock.length];
        stockspan(stock,span);

        for(int i=0; i< span.length; i++){
            System.out.print(span[i]+" ");
        }
    }
}
