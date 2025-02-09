import java.util.*;
public class convertB2D {
    public void convert2Decimal(String n){
        String num = n;
        int sum = 0;
        int base = 1;
        int str_length = n.length();
        for(int i=str_length-1;i>=0;i--){
            if(num.charAt(i) == '1'){
                sum+= base;
            }
            base = base * 2;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convertB2D c = new convertB2D();
        String str = sc.nextLine();
        c.convert2Decimal(str);
        sc.close();
    }
}
