package Pattern;

public class Pattern14 {
	public static void main(String[] args){
		int n = 3;
		for(int i = n; i >= 1; i--){
			for(int j = i-1; j >= 1; j--) {
				System.out.print(' ');
			}
			for(int k = i; k <= n; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
