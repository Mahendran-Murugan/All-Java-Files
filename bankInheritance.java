import java.util.Scanner;

class Account{
  int id, bal;
  String hname;
  Account(int id, int bal, String hname){
    if(id >= 100 && id <=999) this.id = id;
    else this.id = -1;
    if(bal >= 0) this.bal = bal;
    else this.bal = 0;
    this.hname = hname;
  }
  public void setAccountBalanace(){
    System.out.printf("The balance is %d\n", bal);
  }

  public int credit(int amt){
    if(amt > 0) bal += amt;
    return bal;
  }
}

class VIPAccount extends Account{

  VIPAccount(int id, int bal, String hname){
    super(id, bal, hname);
  }
  
  public void setAccountBalance(int nbal){
    System.out.println("The balance can be negative but no less than -10000");
  }
}

class bankInheritance{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int id = in.nextInt();
    String hname = in.next();
    int bal = in.nextInt();
    int camt = in.nextInt();
    int nbal = in.nextInt();
    VIPAccount v = new VIPAccount(id, bal, hname);
    System.out.printf("%d %s %d\n", v.id, v.hname, v.bal);
    int res = v.credit(camt);
    System.out.printf("%d\n%d\n",res,res);
    v.setAccountBalance(nbal);
  }
}

