import java.util.Arrays;
import java.util.Collections;

public class Chocola_problem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

     /*   int arr[]={1,2,3};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(arr[0]+","+arr[1]+","+arr[2]);*/
// doubt in comment section why int not used Collection.reverseorder() method

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1, vp=1;
        int finalcost=0;

        while (h< costHor.length && v< costVer.length){
            // vertical<hor cost
            if(costVer[v]<=costHor[h]){
                finalcost+=(costHor[h]*vp);
                hp++;
                h++;
            }
            else {
                finalcost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length){
            finalcost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while (v<costVer.length){
            finalcost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("final cost ="+finalcost);
    }
}
