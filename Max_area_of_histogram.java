import javax.naming.InsufficientResourcesException;
import javax.swing.*;
import java.util.Stack;

public class Max_area_of_histogram {

    public static  void maxarea(int arr[]){
        int maxarea=0;
        int nextsmalright[]=new int[arr.length];
        int nextsmallest[]=new int[arr.length];
        // nextsmaller right
        Stack<Integer> hs=new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!hs.isEmpty() && arr[hs.peek()]>=arr[i]){
                hs.pop();
            }
            if(hs.isEmpty()){
                 nextsmalright[i]=arr.length;//n
            }
            else {

                nextsmalright[i]=hs.peek();
            }

            hs.push(i);
        }

        // next smaller left
         hs=new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while (!hs.isEmpty() && arr[hs.peek()] >= arr[i]) {
                hs.pop();
            }
            if (hs.isEmpty()) {
                nextsmallest[i] = -1;}
            else {
                nextsmallest[i] = hs.peek();
            }

            hs.push(i);
        }

        // current area: width=j-i-1=nsr[i] - nsl[i] -1
        for(int i=0; i<arr.length; i++){
            int height=arr[i];
            int width=nextsmalright[i]-nextsmallest[i]-1;
            int currarea=height*width;
            maxarea=Math.max(currarea,maxarea);
        }
        System.out.println("max area  in histogram is :"+maxarea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int arr2[]={2,4};
        int arr3[]={5,2};
        int arr4[]={4,2};
        maxarea(arr );
    }
}
