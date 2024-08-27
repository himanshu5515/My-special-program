import java.util.ArrayList;

public class Swap_IN_Arraylist {
    public static void swap(ArrayList<Integer> hs,Integer i, Integer j){
        System.out.println(hs+" phele");
        int temp=hs.get(i);
        hs.set(i,hs.get(j));
        hs.set(j,temp);
        System.out.println(hs+" baad meh");
    }

    public static void main(String[] args) {
        ArrayList<Integer> hs=new ArrayList<>();
        hs.add(1);
        hs.add(5);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        swap(hs,1,4);
    }
}
