import java.util.*;
public class floorIndex {
    static int findFloor(long arr[], int n, long x) {
//        n = size of arr.
//        x = value for which we have to find floor value.
        int low = 0;
        int high = n-1;
        long ans = 0;
        if (x<arr[0]) return -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                low = mid + 1;
                ans = mid;
                System.out.println("->"+mid);
            }
            else{
                high = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,2,5,8,10,11,12,19};
//        long[] arr = {1,2,8,10,11,12,19};
        long[] arr = {66,67,69, 70 ,71 ,72 ,73 ,74 ,75 ,76 ,77, 78, 79 ,80 ,81 ,82 ,83, 84, 85 ,86, 87, 88, 89 ,90 ,91 ,92, 93 ,94, 95 ,96 ,97 ,98 ,99, 100, 101 ,102 ,103 ,104, 105 ,106 ,107 ,108, 109 ,110 ,111, 112, 113 ,114 ,115, 116 ,117 ,118 ,119 ,120 ,121 ,122 ,123 ,124 ,125 ,126 ,127 ,128 ,129 ,130};
        int n = arr.length;
        long x = sc.nextInt();
        int ans = findFloor(arr, n , x);
        System.out.println(ans);
    }
}
