import java.util.*;

class MazeRunner{

  public static void printPossiblePaths(int sR, int sC, int eR, int eC, String ans){
    if (sR == eR && sC == eC){
      System.out.println(ans);
    }
    if (sR > eR || sC > eC) return;
    printPossiblePaths(sR+1, sC, eR, eC,ans+"H");
    printPossiblePaths(sR, sC+1, eR, eC,ans+"V");
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int stR = in.nextInt();
    int stC = in.nextInt();
    int enR = in.nextInt();
    int enC = in.nextInt();
    printPossiblePaths(stR, stC, enR, enC, "");
  }
}