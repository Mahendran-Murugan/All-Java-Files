package Pattern;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for(int i =0; i < n; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
