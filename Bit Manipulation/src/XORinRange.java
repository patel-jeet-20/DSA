import java.util.*;
class solution1 {
    public static int func(int n){
        if(n%4 == 1) return 1;
        else if (n%4 == 2) return n+1;
        else if (n%4 == 3) return 0;
        else return n;
    }

    public static int findXOR(int l, int r) {
        return func(l-1)^func(r);
    }
}
public class XORinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution1 s = new solution1();
        int ans = solution1.findXOR(5, 8);
        System.out.println(ans);
    }
}
