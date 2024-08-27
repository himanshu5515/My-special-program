public class First_occ {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,7,8};
        System.out.println(firstocc(arr,0,3));
    }
    public static int  firstocc(int arr[], int idx, int key){
        if(idx==arr.length){
            return -1;
        }
        int maxi=firstocc(arr,idx+1, key);
        if(key==arr[idx]){
            return idx;
        }
        else {
            return maxi;
        }
    }
}
