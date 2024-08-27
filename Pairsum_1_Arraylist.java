import java.util.ArrayList;

public class Pairsum_1_Arraylist {
    //brute force apporch
 public static boolean pairsum_1(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

            }
        }return false;
    }

    // 2 pointer apporch
public static boolean pairsum(ArrayList<Integer> list,  int target ){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
          // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
          else   if (list.get(lp)+list.get(rp)<  target){
                lp++;
            }
            //case 3
            else {
                rp++;
            }
        }
        return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=8;
        System.out.println(pairsum(list,target));
        System.out.println(pairsum_1(list,target));
    }
}
