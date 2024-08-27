public class Convert_into_String {
    public static void printed(int number,String arr[]){
        if(number==0){
            return;
        }
        int lastdigit=number%10;
        printed(number/10,arr);

        System.out.print(arr[lastdigit]+" ");
    }

    public static void main(String[] args) {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        printed(1234,arr);
    }
}