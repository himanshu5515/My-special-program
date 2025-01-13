public class N_Queen {
    public static void NQueen(char board[][], int row){
        if(row==board.length){
            printBord(board);
            count++;
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            // first check safe or not
            if(isSafe(board,row,j)){
                board[row][j]='Q';
               NQueen(board,row+1);// funx call
               board[row][j]='X';// backtracking step
        }
            }
    }
    public static boolean isSafe(char board[][],int row,int col){
        // vertical up check
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal up left check
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal up right check
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
     public static void printBord(char board[][]){
         System.out.println("-----chess----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
     }
     public static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]= new char[n][n];
        // intitialise
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';

            }
        }
        NQueen(board,0);
        System.out.println("total number of way"+count);
    }
}
