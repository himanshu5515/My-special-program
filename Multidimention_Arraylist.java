import java.util.*;
public class Multidimention_Arraylist {
    public static void main(String[] args) {
        // add list into list
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> lsit2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        // enter value
        for(int i=1; i<6; i++){
            list1.add(i);
            lsit2.add(i*2);
            list3.add(i*3);
        }
        // add all three list into main list
        mainlist.add(list1);
        mainlist.add(lsit2);
        mainlist.add(list3);

        System.out.println(mainlist);
        System.out.println("");

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> curr=mainlist.get(i);
            for(int  j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}