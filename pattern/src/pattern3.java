import java.util.Scanner;

public class pattern3 {
    public void pattern(int n){
        for(int i= 0;i<n;i++){
            for(int j =1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern3 p = new pattern3();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
