import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Fractional_Knapsack {

    public static void main(String[] args) {
      int val[]={60,100,120};
      int weight[]={10,20,30};
      int W=50;

      double ratio[][]=new double[val.length][2];
      // 0 th col >> idx; 1st col > ratio

        for(int i=0; i< val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
            Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

            int capity=W;
            int finalvalue=0;
            for(int i = ratio.length-1; i>=0; i--){
                   int idx=(int)ratio[i][0];
                   if(capity>=weight[idx]){
                       finalvalue+=val[idx];
                       capity-=weight[idx];
                   }
                   else {
                       // include fractional item
                       finalvalue +=(ratio[i][1]*capity);
                       capity=0;
                       break;
                   }
            }
            System.out.println(finalvalue);
        }
    }
