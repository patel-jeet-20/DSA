import java.util.Scanner;

public class pattern5 {
    public void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j =n;j>i;j--){
                System.out.print("*"+" ");
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
