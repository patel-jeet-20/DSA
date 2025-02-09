import java.util.Scanner;

public class pattern16 {
    public void pattern(int n) {
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.printf("%c",'A'+i);
            }
            System.out.print("\n");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern16 p = new pattern16();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
