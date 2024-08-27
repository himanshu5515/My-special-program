public class Power_recursion {

        public static void main(String[] args) {
            int n=5;
            // System.out.println(power_recursion(2,5));
            System.out.println(power(2,5));

        }
        public static int power_recursion(int x,int n){
            if(n==0){
                return 1;
            }
            int a=power_recursion(x,n/2);
            int b=a*a;
            if(n%2==1){
                b=b*x;
            }
            return b;
        }
        public  static int power(int x,int n){
            if(n==0){
                return 1;
            }
            int a=power(x,n-1);
            int b=x*a;
            return b;
        }

}
