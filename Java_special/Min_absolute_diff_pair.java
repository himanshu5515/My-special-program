import java.util.Arrays;

public class Min_absolute_diff_pair {
    public static void main(String[] args) {
        int A[]={4,1,8,7};
        int B[]={2,3,5,6};
        Arrays.sort(A);
        Arrays.sort(B);
        int min_diff=0;

        for(int i=0; i<A.length; i++){
            min_diff+=Math.abs(A[i]-B[i]);
        }
        System.out.println(min_diff);

    }
}
