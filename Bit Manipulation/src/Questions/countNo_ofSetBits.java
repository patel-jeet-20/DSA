package Questions;
import java.util.*;
public class countNo_ofSetBits {
    public void countSetBits(int n){
     int[] binaryNo = new int[1000];
     int res = 0;
     int count = 0;
     while (n>0){
         binaryNo[res] = n % 2;
         n/=2;
         res++;
     }
     for(int i=res-1;i>=0;i--){
         if(binaryNo[i] == 1){
             count++;
         }
     }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countNo_ofSetBits c = new countNo_ofSetBits();
        int n = sc.nextInt();
        c.countSetBits(n);
    }
}
