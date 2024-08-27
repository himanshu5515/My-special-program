public class lastoccurence {
    public static int lastoccerence(int arr[], int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                if (i == arr.length - 1) {
                    return index;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5,3};
        System.out.println(lastoccerence(arr,3));
    }
}
