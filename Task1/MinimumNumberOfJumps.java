public class MinimumNumberOfJumps {

    public static int minJumps(int[] arr) {
        int jumps = 0;
        int farthest = 0;
        int end = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int result = minJumps(arr);
        System.out.println(result); 

        int[] arr2 = {1, 2, 3};
        int result2 = minJumps(arr2);
        System.out.println(result2); 

        int[] arr3 = {1, 1, 1, 1, 1, 1, 1, 0, 1};
        int result3 = minJumps(arr3);
        System.out.println(result3); 

        int[] arr4 = {1, 1, 1, 0, 1, 1, 1, 0, 1};
        int result4 = minJumps(arr4);
        System.out.println(result4); 
    }
}