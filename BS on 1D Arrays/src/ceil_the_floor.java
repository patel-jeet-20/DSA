import java.util.Scanner;
// Ceil the Floor in a sorted array
public class ceil_the_floor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
            int low = 0;
            int high = n-1;
            int ceil = -1, floor = -1;
            while (low <= high){
                int mid = (low+high)/2;
                if(a[mid] <= x){
                    low = mid + 1;
                    floor = a[mid];
                }
                else high = mid - 1;

                if(a[mid] >= x){
                    high = mid-1;
                    ceil = a[mid];
                }
                else low = mid +1;
            }
            return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ceil_the_floor cf = new ceil_the_floor();
        int target = sc.nextInt();
        int[] arr ={3, 4, 7, 8, 8, 10};
        int n = arr.length;
        int[] ans = ceil_the_floor.getFloorAndCeil(arr, n ,target);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
