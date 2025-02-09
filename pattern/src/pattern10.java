import java.util.Scanner;

public class pattern10 {
    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=n;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            pattern10 p = new pattern10();
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int m = sc.nextInt();
                p.pattern(m);
            }
        }
    }

