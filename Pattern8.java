

public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
		for(int i =0; i < n; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
