public class MergeSort {

    public static void merger(int[] arr, int start, int mid, int end){
        int leftSize = mid-start+1, rightSize = end-mid;
        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];
        for(int i = 0; i < leftSize; i++){
            leftArr[i] = arr[start+i];
        }
        for(int i = 0; i < rightSize; i++){
            rightArr[i] = arr[mid+i+1];
        }
        int left = 0, right = 0, arrPointer = start;
        while(left < leftSize && right < rightSize){
            if(leftArr[left] <= rightArr[right]){
                arr[arrPointer] = leftArr[left];
                arrPointer++;
                left++;
            }else{
                arr[arrPointer] = rightArr[right];
                arrPointer++;
                right++;
            }
        }
        while(left < leftSize){
            arr[arrPointer] = leftArr[left];
            arrPointer++;
            left++;
        }
        while(right < rightSize){
            arr[arrPointer] = rightArr[right];
            arrPointer++;
            right++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
        int mid = start+(end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merger(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,2,1,7,8,0,6};
        mergeSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
