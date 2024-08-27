public class Most_repeting_digit {
    public static void mostrepeting(int arr[]){
        int count=1;
        int total_count=0;
        int digit=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if (total_count<count){
                    total_count=count;
                    digit=arr[i];
                }
            }
        }
        System.out.println(digit);
    }

    public static void main(String[] args) {
        int arr[]={3,2,3,4,2,3,4,3};
        mostrepeting(arr);
    }
}
