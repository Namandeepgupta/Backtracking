public class GridWays {
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        int count = countGridWays(0, 0, n, m);
        System.out.println("Ways: " + count);
    }
    public static int countGridWays(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        //boundary case
        if(i == n || j == m){
            return 0;
        }
        int x = countGridWays(i+1, j, n, m);
        int y = countGridWays(i, j+1, n, m);
        return x+y;
    }
}
