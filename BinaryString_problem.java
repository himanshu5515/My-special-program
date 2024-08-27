public class BinaryString_problem {
    public static void printbin(int n, int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbin(n-1,0,str+"0");
        if(last==0){
            printbin(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        printbin(4,0," ");
    }
}
