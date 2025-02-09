import java.util.*;
public class minAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < s - 1; i++) {
//           int mini = i;
//            for (int j = i; j < s; j++) {
//                if (arr[j] < arr[mini]) {
//                    mini = j;
//                }
//            }
//            int temp = arr[mini];
//            arr[mini] = arr[i];
//            arr[i] = temp;
//        }


//        System.out.println(arr[0]);
//        System.out.println(arr[s-1]);
//        checking if array is sorted or not
        boolean isAscending = false;
        for(int i=0;i<s-1;i++){
            if (arr[i+1] > arr[i]){
                isAscending = true;
            }
        }
        if(!isAscending){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
