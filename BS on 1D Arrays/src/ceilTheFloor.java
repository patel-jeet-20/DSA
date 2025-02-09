import java.util.*;
// Ceil the Floor in an unsorted array
public class ceilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr){
        int ceil = -1, floor = -1;
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++) {
            if (arr[i] <= x && largest > (x - arr[i])) {
                floor = arr[i];
                largest = (x - arr[i]);
            }
            if(arr[i] >= x && smallest >(arr[i] - x)){
                ceil = arr[i];
                smallest = (x-arr[i]);
            }
        }

        return new int[] {floor, ceil};
//        return new int[] {1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ceilTheFloor cf = new ceilTheFloor();
        int target = sc.nextInt();
//        int[] arr = {5, 6, 9, 9, 6, 5, 5, 6};
        int[] arr  = {5, 6, 8, 8, 6, 5, 5, 6};
        int[] ans = cf.getFloorAndCeil(target, arr);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }
}
