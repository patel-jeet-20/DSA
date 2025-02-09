import java.util.*;
public class countingFrequency {
    public static void frequencyCount(int arr[], int N, int P) {
        int[] hash = new int[P + 2];
        for (int i = 1; i <= N; i++) {
            hash[arr[i]] += 1;
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(hash[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();
        System.out.print("Enter P:");
        int P = sc.nextInt();
        int[] arr = new int[P+2];
        System.out.println(arr.length);
        for(int i= 0; i < N;i++){
            arr[i+1] = sc.nextInt();
        }
//        System.out.println(arr[0]);
        for (int i=1;i<=N;i++){
            System.out.println(arr[i]);
        }
        countingFrequency.frequencyCount(arr,N,P);
    }

}
