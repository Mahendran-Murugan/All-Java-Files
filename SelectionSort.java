public class SelectionSort {

    public static void selectionSort(int[] arr){
        int minIndex, n = arr.length;
        for(int i = 0; i < n-1; i++){
            minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,3,0};
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
