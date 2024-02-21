import java.util.Scanner;

class MaximumElement{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) arr[i] = in.nextInt();
      int max = arr[0];
      for(int i =1; i < n; i++) max = Math.max(max, arr[i]);
      System.out.printf("%d is the maximum element in the array", max);
    }
}