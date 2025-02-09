package Questions;
import java.util.*;
public class clearThe_ith_bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = (n & (~(1<<i)));
        System.out.println(res);
    }
}
