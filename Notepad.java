import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        int count=0;
        Scanner hs=new Scanner(System.in);
        while(hs.hasNext()){
            count++;
            String title=hs.next();
            System.out.println(count+" ,"+title);
        }
        hs.close();
    }
}
