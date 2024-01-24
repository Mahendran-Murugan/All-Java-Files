import java.util.*;

public class MinimumDays
{
    public static int calculateNoOfOnes(long n){
        int oneCount = 0;
        while(n > 0){
            oneCount += n % 2;
            n /= 2;
        }
        return oneCount;
    }
	public static void main(String[] args) {
		long n;
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter the Value of n: ");
		n = in.nextLong();
		System.out.println(calculateNoOfOnes(n));
	}
}
