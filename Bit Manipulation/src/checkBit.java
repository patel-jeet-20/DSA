import java.util.*;
public class checkBit {
    static boolean checkKthBit(int n, int k) {
        if((n&(1<<k)) != 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     boolean ans = checkBit.checkKthBit(n, k);
     System.out.println(ans);
    }
}
