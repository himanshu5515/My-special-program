import java.util.Scanner;

public class int_to_roman {
    public static void main(String[] args) {
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Scanner hs=new Scanner(System.in);
        int num=hs.nextInt();
        System.out.println(inttoroman(num,val,rom));
    }
    public static String inttoroman(int num, int val[],String rom[]){
         StringBuilder ans=new StringBuilder();
         for(int i=0; i<val.length; i++){
             while(num>=val[i]){
                 ans.append(rom[i]);
                 num-=val[i];
             }
         }
         return ans.toString();
    }
}

/*class Solution {
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int N) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; N > 0; i++)
            while (N >= val[i]) {
                ans.append(rom[i]);
                N -= val[i];
            }
        return ans.toString();
    }
}*/