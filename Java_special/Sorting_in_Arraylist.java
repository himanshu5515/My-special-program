import java.util.ArrayList;
import java.util.Collections;

public class Sorting_in_Arraylist {
    public static void sorting(ArrayList<Integer>hs){
        System.out.println(hs);
        Collections.sort(hs);
        System.out.println(hs+"asending order sort");
        Collections.sort(hs,Collections.reverseOrder());
        System.out.println(hs+" desending order sort");
    }

    public static void main(String[] args) {
        ArrayList<Integer>hs=new ArrayList<>();
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(5);
        hs.add(3);
        sorting(hs);
    }
}
