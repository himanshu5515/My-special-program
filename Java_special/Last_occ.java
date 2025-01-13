public class Last_occ {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,6,7};
        System.out.println(last(arr,0,3));
    }
    public static int last(int arr[], int idx, int key){
        if(idx==arr.length){
            return -1;
        }
        int last_i=last(arr, idx+1, key);
        if(last_i==-1){
            if(arr[idx]==key){
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return last_i;
        }
    }
}
