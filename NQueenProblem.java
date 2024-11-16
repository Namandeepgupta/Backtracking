public class NQueenProblem{
    public static void nQueen(char board[][], int row){
        if(row == board.length){
            print(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
        //up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //up left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //up right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void print(char board[][]){
        System.out.println("----------chess board-------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.' ;
            }
        }
        nQueen(board, 0);
    }
}