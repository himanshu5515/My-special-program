import java.util.Stack;

public class Valid_paraenthisis {
    public static boolean validparaenthisis(String str){
        Stack<Character> hs= new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                hs.push(ch);
            } else {
                // closing
                if (hs.isEmpty()) {
                    return false;
                }
                // appling all condition
                if (hs.peek() == '{' && ch == '}' || hs.peek() == '(' && ch == ')' || hs.peek() == '[' && ch == ']') {
                    hs.pop();
                } else {
                    return false;
                }
            }
        }
        if(hs.isEmpty()){
            return true;}
        else {
            return false; }

    }
    public static void main(String[] args) {
        Stack<Character> hs= new Stack<>();
       String str = "({[]})";
        System.out.println(validparaenthisis(str));
    }
}
