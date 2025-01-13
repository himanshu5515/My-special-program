public class Sudoku_solver_game {
    public static boolean sudokusolver(int sudoku[][],int row,int col){
       if(row==9 ){
           return true;
       }

        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
                return sudokusolver(sudoku,nextrow,nextcol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku,row, col,digit)){
                sudoku[row][col]=digit;
                if(sudokusolver(sudoku,nextrow,nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }return false;
    }
    public static  boolean isSafe(int sudoku[][], int row,int col,int digit){
        // column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        // grid
        int Sr=(row/3)*3;
        int Sc=(col/3)*3;
        //3*3 grid
        for(int i=Sr; i<Sr+3;i++){
            for(int j=Sc; j<Sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public  static  void printsudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][]={{0,0,0,8,0,0,0,0,9},
                        {0,1,9,0,0,5,8,3,0},
                        {0,4,3,0,1,0,0,0,7},
                        {4,0,0,1,5,0,0,0,3},
                        {0,0,2,7,0,4,0,1,0},
                        {0,8,0,0,9,0,6,0,0},
                        {0,7,0,0,0,6,3,0,0},
                        {0,3,0,0,7,0,0,8,0},
                        {9,0,4,5,0,0,0,0,1}};

        if(sudokusolver(sudoku,0,0)){
            System.out.println("solution exist");
             printsudoku(sudoku);
        }
        else {
            System.out.println("solution does not exist");
        }
    }
}
