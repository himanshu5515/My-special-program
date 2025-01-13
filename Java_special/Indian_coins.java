import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Indian_coins {
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coin, Comparator.reverseOrder());
        int countofcoin=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0; i<coin.length; i++){
            if(coin[i]<amount){
                while (coin[i]<=amount){
                    countofcoin++;
                    ans.add(coin[i]);
                    amount-=coin[i];
                }
            }
        }
        System.out.println(countofcoin);

        for (int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
