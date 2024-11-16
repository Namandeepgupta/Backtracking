import java.util.*;

public class Permutation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.next();
        System.out.print("Permutations: ");
        findPermutation(str, "");
    }
    public static void findPermutation(String str, String ans){
        if( str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1, str.length());
            findPermutation(newStr, ans+curr);
        }
    }
}
