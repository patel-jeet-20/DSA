import java.util.Scanner;

public class pattern8 {
    public void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j =n;j>i;j--){
                System.out.print(" ");
            }
            for(int j =0;j<(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern9 p = new pattern9();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
