public class Consicutive_1_s {
    public static int consicutive_1s(int arr[],int count){
        int maxmun=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
                if(i==arr.length-1){
                    maxmun=count;
                }
            }
            else{
                maxmun=Math.max(maxmun,count);
                //  System.out.println(maxmun);
                count=0;
            }
        }
        return maxmun;
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1};
        System.out.println(consicutive_1s(arr,0));
    }
}
