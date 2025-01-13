import java.util.ArrayList;

public class Subsequence_string_recursion {
    public static void main(String[] args) {
     ArrayList<String> ans=getSSq("abc");
      for(String s:ans){
         System.out.println(s);
      }
    }
    public static ArrayList<String> getSSq(String s){
        ArrayList<String> ans=new ArrayList<>();

         if(s.length()==0){// return empty string ""
            ans.add("_");
            return ans;
         }

        char curr=s.charAt(0);// s=abc , curr=a
        ArrayList<String> smallans=getSSq(s.substring(1));//["bc","b","c"," "]
         //ans=["bc","b","c"," ","abc","ab","ac","a "]


        for(String ss : smallans){// for each loop hai
            ans.add(ss);//bc
            ans.add(curr+ss);//abc

        }
        return ans;

    }
}
