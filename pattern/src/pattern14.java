import java.util.Scanner;

public class pattern14 {
    public void pattern(int n) {
        for (int i=0;i<n;i++){
            for (char ch = 'A';ch<='A'+i;ch++){
                System.out.print(ch+" ");

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern18 p = new pattern18();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
