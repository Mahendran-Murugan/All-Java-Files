import java.util.Scanner;

public class PalindromivArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int count = 0;
            int n = in.nextInt();
            int[] arr= new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            int left = 0;
            int right = n-1;
            while (left < right) {
                if(arr[left] == arr[right]){
                    left++;
                    right--;
                }
                else if(arr[left] < arr[right]){
                    left++;
                    arr[left] = arr[left] + arr[left-1];
                    count++;
                }else if(arr[left] > arr[right]){
                    right--;
                    arr[right] = arr[right] + arr[right+1];
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
        in.close();
    }
}
