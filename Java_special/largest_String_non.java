public class largest_String_non {
    public static void main(String[] args) {
        String str="abcabcbb";// 3
        String str1="pwwkew";//3
        String str2="bbbb";//1
        String str3=" ";
        System.out.println(largestString(str1,0));
    }
    public static int  largestString(String str, int result){


        int length=1;
        for(int i=1; i<str.length(); i++){
            for(int j=0; j<i; j++){
                if(str.charAt(i)==str.charAt(j)){
                    result=Math.max(result,length);
                    length=0;
                }
            } length++;
        }
        return result;

    }
}
