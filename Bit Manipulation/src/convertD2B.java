import java.util.*;
public class convertD2B {
    public void convert2Binary(int n){
        int[] binaryNumber = new int[1000];
        int res = 0;
        while (n > 0){
            binaryNumber[res] = n % 2;
            n /= 2;
            res ++;
        }
        int count = 0;
        for(int i =res-1;i>=0;i--){
            System.out.print(binaryNumber[i]+" ");
//            if(binaryNumber[i] == 1){
//                count++;
//            }
        }
//        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convertD2B c = new convertD2B();
        int n = sc.nextInt();
        c.convert2Binary(n);
    }
}
