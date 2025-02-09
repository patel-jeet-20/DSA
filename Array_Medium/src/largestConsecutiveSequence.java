import java.util.*;
public class largestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        if(n == 0) return 0;
        int longest = 1;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int s:st){
            if(!st.contains(s-1)){
                    int cnt = 1;
                    int x = s;
                    while (st.contains(x+1)){
                        x += 1;
                        cnt += 1;
                    }
                    longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        largestConsecutiveSequence lcs = new largestConsecutiveSequence();
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int ans = lcs.longestConsecutive(arr);
        System.out.println(ans);
    }
}
