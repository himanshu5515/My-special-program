// divide by 2 and multiply by 2 if result is same as input then it is even else odd

public class Check_even_without_modulo {
    public static void check(int n){
        int value1=n/2;
        int value2=value1*2;
        if(value2==n){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        check(4);
    }
}