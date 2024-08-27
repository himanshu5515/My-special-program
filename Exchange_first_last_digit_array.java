import java.text.BreakIterator;
import java.util.Scanner;

public class Exchange_first_last_digit_array {
    public static void reverse(int n){
        int last_digit=n%10;//1234>.4
        int temp_lst=last_digit;//4;
        int reverse=0;
        while(n>0){
            temp_lst=n%10;
            reverse=(reverse*10)+temp_lst;
            n=n/10;
        }
        int first_digit=reverse%10;
        System.out.println("reverse number :"+reverse);//4321;
        reverse=reverse/10;//432
        int ans=last_digit;
        while (reverse>last_digit){//4321>4;
            int temp=reverse%10;
            ans=(ans*10)+temp;
            reverse=reverse/10;
        }
        ans=(ans*10)+first_digit;
        System.out.println("final answer :"+ans);

    }

    public static void main(String[] args) {
        Scanner hs=new Scanner(System.in);
        int n=hs.nextInt();
        reverse(n);
    }
}
