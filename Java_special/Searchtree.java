import java .util.*;
public class Searchtree{
    public static int  flagstone(int n,int m, int a){
        int ln1=n/a;// length se unconverd area
        if(n%a!=0){ln1++;}
        int wn1=m/a;// wide se unconver area
        if(m%a!=0){
            wn1++;}
        int numofflags= ln1*wn1;// multiple reminder area
        return numofflags;
    }

    public static void main(String[] args) {
        Scanner hs=new Scanner(System.in);
        int n=hs.nextInt();
        int m=hs.nextInt();
        int a=hs.nextInt();
        System.out.println(flagstone(n,m,a));
    }
}