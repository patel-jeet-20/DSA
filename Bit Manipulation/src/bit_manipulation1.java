import java.util.*;
public class bit_manipulation1 {
    static void bitManipulation(int num, int i){
        int n = i-1;
        int marks = (num & (1<<n));
        int geti = (marks >> n);
        int seti = (num | (1<<n));
        int cleari = (num & (~(1<<n)));
        System.out.println(geti+" "+seti+" "+cleari);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = sc.nextInt();
        System.out.print("Enter i:");
        int i = sc.nextInt();
        bit_manipulation1.bitManipulation(n, i);
    }
}
