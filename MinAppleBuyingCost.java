import java.util.*;

public class MinAppleBuyingCost
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int apple = in.nextInt();
	    int m1A = in.nextInt();
	    int m1P = in.nextInt();
	    int m2A = in.nextInt();
	    int m2P = in.nextInt();
	    int p1 = 0, p2 = 0, cost = 0, minCost = 10000;
	    for(int i = 0; i*m1A < apple; i++){
	        if((apple - i*m1A)%m2A == 0){
	            p1 = i*m1P;
	            p2 = ((apple - i*m1A)/m2A)*m2P;
	            cost = p1+p2;
	            minCost = Math.min(minCost, cost);
	        }
	    }
	    System.out.print(minCost);
	}
}