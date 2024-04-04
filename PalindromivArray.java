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
                }else{
                    if(arr[left] < arr[right]){
                        left++;
                        arr[left] = arr[left] + arr[left-1];
                        arr[left-1] = Integer.MIN_VALUE;
                        // lc++;
                    }else{
                        right--;
                        arr[right] = arr[right] + arr[right+1];
                        arr[right+1] = Integer.MIN_VALUE;
                        // rc++;
                    }
                    count++;
                }
                
            }
            System.out.println(count);
            for(int i = 0; i < n; i++){
                if(arr[i] != Integer.MIN_VALUE){
                    System.out.print(arr[i]+ " ");
                }
            }
            t--;
        }
        in.close();
    }
}
