package Questions;

import java.util.*;
public class checkiThBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if((n & (1<<i))!= 0) {
            System.out.println(true);
        }
        else System.out.println(false);

        if(((n >> i) & 1)!=0) System.out.println("set");
        else System.out.println("unset");
    }
}
