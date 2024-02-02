import java.util.*;

class DistinctElemets{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    for(int i = 1; i < n; i++){
      if(arr[i-1] == arr[i]) count++;
    }
    System.out.println(n-count);
  }
}