import java.util.Stack;

public class Maximal_rectangle {


        public static  int maxarea(int arr[]){
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
            return maxarea;
        }
        public static int largest_rectangle(int arr[][]){
            int arr1[]=new int[arr[0].length] ;

            for(int i=0; i<arr[0].length; i++){
                arr1[i]=arr[0][i];
            }

            int area=maxarea(arr1);

            for(int i=1; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j]==1){
                        arr1[j]++;
                    }
                    else {
                        arr1[j]=0;
                    }
                }

                int n=maxarea(arr1);// call function again and again
                area=Math.max(area , n);

            }
            return area;
        }

        public static void main(String[] args) {
            int arr[][]={{1,0,1,0,0,0},
                    {1,0,1,1,1,1},
                    {1,1,1,1,1,1},
                    {1,0,0,1,0,1}};
            System.out.println(largest_rectangle(arr));
        }
    }


