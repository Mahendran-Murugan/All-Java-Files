public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            if ((long) (left * left) + (long) (right * right) == c)
                return true;
            else if ((long) (left * left) + (long) (right * right) < c)
                left++;
            else
                right--;
        }
        return false;
    }
}
