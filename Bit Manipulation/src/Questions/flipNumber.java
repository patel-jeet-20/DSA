package Questions;
import java.util.*;
public class flipNumber {
    public static int bitFlip(int start,int end){
        int[] bitCount = new int[1000];
        int i = 0;
        int count = 0;
        int n = (start ^ end);
        while(n != 0){
            bitCount[i] = n % 2;
            if(bitCount[i] == 1){
                count++;
            }
            i++;
            n /= 2;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans = flipNumber.bitFlip(start, end);
        System.out.println(ans);
    }
}