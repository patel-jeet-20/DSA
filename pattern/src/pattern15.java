import java.util.Scanner;

public class pattern15 {
    public void pattern(int n) {
        for (int i=n;i>0;i--){
            for (char ch = 'A';ch<='A'+i-1;ch++){
                System.out.print(ch+" ");

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern15 p = new pattern15();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
