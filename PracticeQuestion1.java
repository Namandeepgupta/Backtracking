public class PracticeQuestion1 {
    public static void main(String args[]){
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};
        int solution[][] = new int [maze.length][maze[0].length];
        if(solveMaze(maze, solution, 0, 0)){
            System.out.println("Soution exist.");
            printSolution(solution);
        }
        else{
            System.out.println("Soution not exist.");
        }
    }
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol[0].length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean solveMaze(int maze[][],int solution[][], int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1 && maze[row][col] == 1){
            solution[row][col] = 1;
            return true;
        }
        if(isSafe(maze, row, col)){
            solution[row][col] = 1;
            if(solveMaze(maze, solution, row+1, col)){
                return true;
            }
            if(solveMaze(maze, solution, row, col+1)){
                return true;
            }
            solution[row][col] = 0;
            return false;
        }
        return false;
    }
    public static boolean isSafe(int maze[][], int row, int col){
        return (row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1);
    }
}
