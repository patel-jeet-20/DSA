import java.util.*;
public class pattern17 {
    public void pattern(int n) {
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int bp = (2*i+1)/2;
            for(int j=0;j<(2*i+1);j++){
                System.out.print(ch+" ");
                if (j<bp){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern17 p = new pattern17();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);

        }
    }
}