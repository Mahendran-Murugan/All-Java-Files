import java.util.*;

class MazeRunner{

  public static int printPossiblePaths(int sR, int sC, int eR, int eC){
    if (sR == eR && sC == eC) return 1;
    if (sR > 2 || sC > 2) return 0;
    return printPossiblePaths(sR+1, sC, eR, eC)+printPossiblePaths(sR, sC+1, eR, eC);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int stR = in.nextInt();
    int stC = in.nextInt();
    int enR = in.nextInt();
    int enC = in.nextInt();
    
    System.out.println(printPossiblePaths(stR, stC, enR, enC));
  }
}