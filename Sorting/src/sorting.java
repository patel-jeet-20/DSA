class sorting {
    public void selectionSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i;j<n;j++){
               if (arr[j] < arr[mini]){
                   mini = j;
               }
            }
            int temp = arr[mini];   
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public void bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public void insertionSort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int swap = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }
    }

}
