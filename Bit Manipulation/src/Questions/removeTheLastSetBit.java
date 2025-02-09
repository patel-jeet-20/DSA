package Questions;
import java.util.*;
public class removeTheLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previousTon = n-1;
        int res = n & previousTon;
        System.out.println(res);
        sc.close();
    }
}
