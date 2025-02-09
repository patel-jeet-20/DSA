import java.util.*;
public class mergeSort {
    public void merge(int[] arr,int l,int mp,int h){
            int n1 = mp-l+1;
            int n2 = h-mp;
            int[] L = new int[n1];
            int[] H = new int[n2];
            for(int i=0;i<n1;i++){
                L[i] = arr[i+l];
            }
            for(int j=0;j<n2;j++){
                H[j] = arr[j+1+mp];
            }
            int i =0,j=0,k=l;
            while (i<n1 && j<n2){
                if(L[i] <= H[j]){
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = H[j];
                    j++;
                }
                k++;
            }
            while (i<n1){
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j<n2){
                arr[k] = H[j];
                j++;
                k++;
            }

    }
    public void sort(int[] arr,int l,int h) {
        if(l<h) {
            int mp = (l + h)/2;
            sort(arr,l,mp);
            sort(arr,mp+1,h);
            merge(arr,l,mp,h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mergeSort ms = new mergeSort();
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        int size = arr.length;
        ms.sort(arr,0,size-1);
       for(int i=0;i<s;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
