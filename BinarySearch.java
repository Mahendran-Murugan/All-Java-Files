import java.util.*;
  
  class BinarySearch{
    public static int binarySearch(int[] arr, int low, int high, int s){
      if(low <= high){ 
      int mid = low+(high-low)/2;
      System.out.println(mid+" "+arr[mid]);
      if(arr[mid] == s) return mid;
      if(arr[mid] > s) return binarySearch(arr,low,mid-1,s);
        return binarySearch(arr,mid+1,high,s);
      }
      return -1; 
  }
  
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = in.nextInt();
      }
      int s = in.nextInt();
      System.out.print(binarySearch(arr, 0, n, s));
    }
  }