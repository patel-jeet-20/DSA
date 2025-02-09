import java.util.Scanner;

public class pattern12 {
    public void pattern(int n) {
        int space = (2*n)-2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.print("\n");
            space-=2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern12 p = new pattern12();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
