public class Demo {
    public static void main(String[] args) {
          int arr[]={10,6,5,7,1

          };
          //bubblesort(arr);
        //selectionsort(arr);
        insertion_sort(arr);
    }
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int k=0;
            while(k<n-1-i){
                if(arr[k]>arr[k+1]){ // to swap
                    int temp=arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=temp;
                }
                k++;
            }
        }
        // to print sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    //////////////////////// selection sort
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    ////////////////// insertion sort
    public static  void insertion_sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
                int key = arr[i]; // Current element to insert
                int j = i - 1;

                // Move elements that are greater than 'key' one position ahead
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                // Place 'key' in its correct position
                arr[j + 1] = key;
            }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}