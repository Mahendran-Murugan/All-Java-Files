package Pattern;

import java.util.Scanner;

class CompetitivePattern15{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int count = 0;
		boolean flag = true;
		for(int i = 2; count < n; i++) {
			flag = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				arr[count] = i;
				count++;
			}
		}
		for(int i =0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}