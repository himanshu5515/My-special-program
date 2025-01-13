public class Find_subset {
    public static void findsubset(String string, String ans,int i){
        // base case
        if(i== string.length()){
            // for null value
            if(ans.length()==0){
                System.out.println("null");
            }
            else {
            System.out.println(ans);
            }
            return;  }

        // yes choice
       findsubset(string, ans+string.charAt(i),i+1);
       //no choice
       findsubset(string, ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findsubset(str,"",0);
    }
}
