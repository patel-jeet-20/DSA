package Questions;
import java.util.*;
public class checkinfNumber_a_powerOf2_orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n+" is a power of 2.");
        }
        else System.out.println("Not a power of 2.");
        sc.close();
    }
}
