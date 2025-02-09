import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
public class thirdDistinctMaximum {
    public int thirdMax(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        thirdDistinctMaximum tds = new thirdDistinctMaximum();
//        int[] arr = {3,2,1};
//        int[] arr = {2,1};
        int[] arr = {2,2,3,1};
//        int[] arr = {1,1,2};
        int ans = tds.thirdMax(arr);
        System.out.println(ans);
    }
}
