import java.util.Scanner;

public class pattern4 {
    public void pattern(int n){
        for(int i= 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern4 p = new pattern4();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
