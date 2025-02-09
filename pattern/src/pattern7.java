import java.util.Scanner;

public class pattern7 {
    public void pattern(int n){
        for(int i =1;i<=n;i++){
           for(int j =1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j =1;j<(2*i);j++) {
               System.out.print("*");
           }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern7 p = new pattern7();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
