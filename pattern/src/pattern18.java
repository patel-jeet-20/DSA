import java.util.Scanner;

public class pattern18 {
    public void pattern(int n) {
        int ascii = 64+n;
//        System.out.println(ascii);
        for(int i=0;i<n;i++){
            int temp = ascii - i;
//            System.out.println(temp);
            for(char ch = (char)temp ;ch<=(char)ascii;ch++){
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern18 p = new pattern18();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            p.pattern(m);
        }
    }
}
