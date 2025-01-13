import java.util.ArrayList;

public class Find_maxi_Arraylist {
    public static int findmaximum(ArrayList<Integer> hs,int num){
        for(int i=0; i<hs.size(); i++){
            if(num<hs.get(i)){
                num=hs.get(i);
            }
        }return num;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hs=new ArrayList<>();
        hs.add(1);
        hs.add(2);
        hs.add(9);
        hs.add(4);
        hs.add(5);
        int num=Integer.MIN_VALUE;
        System.out.println(findmaximum(hs,num));
    }
}
