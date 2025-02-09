import java.util.*;
public class pattern2 {
    public void pattern(int n){
        for(int i= 0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern2 p = new pattern2();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
