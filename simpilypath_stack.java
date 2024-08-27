import java.util.Stack;

public class simpilypath_stack {
    public static String simpilypath(String path){
        String []arr=path.split("/");
        Stack<String> hs=new Stack<>();

        for(String i : arr){
            if(i.equals("..") && !hs.empty()){
                hs.pop();
            }
            else if(!i.equals("") &&! i.equals(".") && !i.equals((".."))){
                hs.push(i);
            }
        }
        StringBuilder hss=new StringBuilder();
        for(String  i : hs){
            hss.append("/");
            hss.append(i);
        }

        return hss.length()==0 ? "/" : hss.toString();
    }
    public static void main(String[] args) {
        String path="/home/user/Documents/../Pictures";
        System.out.println(simpilypath(path));
    }
}
