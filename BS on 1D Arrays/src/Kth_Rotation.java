import java.util.*;
import java.lang.*;
public class Kth_Rotation {
    public int findKRotation(List<Integer> arr) {
        int low = 0;
        int high = arr.size()-1;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr.get(low) <= arr.get(mid)){
                ans = Math.min(ans,arr.get(low));
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,arr.get(mid));
                high = mid - 1;
            }
        }

        return arr.indexOf(ans);
    }

    public static void main(String[] args) {
        Kth_Rotation k = new Kth_Rotation();
        List<Integer> al = new ArrayList<>();
        al.add(36);
        al.add(6);
        al.add(11);
        al.add(14);
        al.add(18);
        al.add(36);
        al.add(37);
        al.add(38);
        int ans = k.findKRotation(al);
        System.out.println(ans);
    }
}
