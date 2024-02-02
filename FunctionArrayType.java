import java.util.Scanner;

public class Main {
    public static int arrayTypeFinder(int n, int[] arr){
        int arrType = 0, even = 0, odd = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        if(even == 0) arrType = 2;
        else if(odd == 0) arrType = 1;
        else arrType = 3;
        return arrType;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        String s = (arrayTypeFinder(n, arr) == 1)?"Even":(arrayTypeFinder(n,arr) == 2)?"Odd":"Mixed";
        System.out.print("The array is "+s);
    }
}
