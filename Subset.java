import java.util.*;

public class Subset {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.next();
        System.out.print("Subset: ");
        findSubset(str, 0, "");
    }
    public static void findSubset(String str, int index, String ans){
        if(index == str.length()){
            if(ans.length() == 0){
                System.out.print("null.");
            }
            else{
                System.out.print(ans + ", ");
            }
            return;
        }
        findSubset(str, index+1, ans+str.charAt(index));
        findSubset(str, index+1, ans);
    }
}
