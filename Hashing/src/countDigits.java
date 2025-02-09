import java.util.*;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int s = sc.nextInt();
        int[] arr =new int[s];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for(int i=0;i<s;i++){
            hash[arr[i]]+=1;
        }
        System.out.print("Enter Queries:");
        int q = sc.nextInt();
        while(q>0){
            int n = sc.nextInt();
            System.out.println("no.of elements:"+hash[n]);
            q--;
        }
    }
}
