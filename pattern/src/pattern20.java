import java.util.Scanner;

public class pattern20 {
    public void pattern(int n){
        int space = (2*n)-2;
        for(int i=1;i<=(2*n-1);i++){
            int stars = i;
            if (i>n) stars=(2*n)-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n) space-=2;
            else space+=2;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pattern20 p = new pattern20();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
