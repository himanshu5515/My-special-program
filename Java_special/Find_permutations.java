public class Find_permutations {

    public static void findpermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            // "abcde"="ab"+ "de"= abde
         String  newst=str.substring(0,i)+str.substring(i+1);//1> bc
            //System.out.println(newst+" ");
            findpermutation(newst,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        findpermutation(str, "");
    }
}
// time complexcity= O(N*N!)