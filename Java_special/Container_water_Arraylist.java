// using 2 pointer apporach
import java.util.ArrayList;

public class Container_water_Arraylist {
  public static  int storewater(ArrayList<Integer> height){
      int maxiwater=0;
      int lp=0;
      int rp=height.size()-1; // n-1
      while(lp<rp){
          // calculate water area
          int ht=Math.min(height.get(lp),height.get(rp));
          int width=rp-lp;
          int currwater=ht*width;
          maxiwater=Math.max(maxiwater,currwater);
          if(height.get(lp)<height.get(rp)){
              lp++;
          }
          else {
              rp--;
          }
      }
      return maxiwater;
  }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
    }
}
