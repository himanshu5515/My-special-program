public class GCD_using_recursion {
    public static void main(String[] args) {
        System.out.println(gcd(4,9));
        System.out.println(gcd_without_r(4,9));
    }
    // without recursion
    public static int gcd_without_r(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    // with recursion
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }

        int ans=gcd(y,x%y);
        return ans;
    }


}
