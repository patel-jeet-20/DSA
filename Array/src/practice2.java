import java.util.*;

//finding second-largest element in an array
public class practice2 {
    public static int findSecondLargest(int n, int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        for(int i =1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
//Better approach TC = O(2N)
//        for(int i=1;i<n;i++){
//            if(arr[i]>largest){
//                largest = arr[i];
//            }
//        }
//        for(int i=0;i<n;i++){
//         if(arr[i]>slargest && arr[i] != largest){
//             slargest = arr[i];
//         }
//        }

        return slargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice2 p = new practice2();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = practice2.findSecondLargest(n, arr);
        System.out.println(ans);
    }

}
