public class Tower_of_Hanoi {
    public static void tower(int n, String src,String helper,String desti){
        if(n==1){
            System.out.println("transfer disk"+ n +"from"+ src +"to"+ desti);
            return;
        }
        // transfer top n-1 from src to helper using desti as helper
        tower(n-1,src,desti,helper);
        // transfer nth from src to desti         /// S to D
        System.out.println("transfer disk"+n+" from"+ src+" to"+ desti+"l");
        // transfer n-1 from helper to dist using src as helper
        tower(n-1,helper,src,desti);
    }

    public static void main(String[] args) {
        int n=3; // for code understand n=2 and dry run
        tower(n,"S","H","D");
    }
}