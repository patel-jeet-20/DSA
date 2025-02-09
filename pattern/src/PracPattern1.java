import java.util.Scanner;

public class PracPattern1 {
    public void pattern(int n){
        int ascii = 64+n;
        for(int i=0;i<n;i++){
            for(char ch=(char)ascii;ch>=((char)ascii )-i;ch--){
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PracPattern1 p = new PracPattern1();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}