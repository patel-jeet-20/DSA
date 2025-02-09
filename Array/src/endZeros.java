import java.util.*;
// moving all the zeros in a
public class endZeros {
    public void brute(int[] arr,int n){
        ArrayList<Integer> t = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                t.add(arr[i]);
            }
        }
        int size = t.size();
        for (int i=0;i<size;i++){
            arr[i] = t.get(i);
        }
        for (int i=size;i<n;i++){
            arr[i] = 0;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void moveZeroes(int[] nums){
        int j=-1;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1){
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        }
        if(j != -1){
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        endZeros e = new endZeros();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        e.brute(arr,n);
        e.moveZeroes(arr);
        sc.close();
    }
}
