import java.util.Scanner;

public class pattern19 {
    public void pattern(int n){
        int space1 = 0;
        int space2 = (2*n)-2;
        for(int i=n;i>0;i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < space1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            space1 += 2;
            System.out.print("\n");
        }
            for(int i=0;i<n;i++){
              for(int j=0;j<=i;j++){
                  System.out.print("*");
              }
              for(int j =0;j<space2;j++){
                  System.out.print(" ");
              }
              for(int j=0;j<=i;j++){
                  System.out.print("*");
              }
              space2 -= 2;
              System.out.print("\n");
            }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern19 p = new pattern19();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
