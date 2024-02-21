import java.util.Scanner;

class NoOfWaysDice{
  public static void combinations(int st, int end, String ans){
    if(st == end){
      System.out.println(ans);
    }
    if(st > end) return;
    combinations(st+1,end,ans+"1");
    combinations(st+2,end,ans+"2");
    combinations(st+3,end,ans+"3");
    combinations(st+4,end,ans+"4");
    combinations(st+5,end,ans+"5");
    combinations(st+6,end,ans+"6");
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    combinations(0, n, "");
  }
}