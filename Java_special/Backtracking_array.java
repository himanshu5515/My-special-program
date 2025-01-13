import javax.naming.PartialResultException;

public class Backtracking_array {
    public static void changeddarr(int arr[], int i,int val){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i]=val;
        changeddarr(arr,i+1,val+1);// fnx call step
        // how i became a best coder
        arr[i]=arr[i]-2;// backtracking step
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
    public static void main(String args[]){
       int arr[]= new int[5];
       changeddarr(arr, 0,1);
       printarr(arr);
    }
}
