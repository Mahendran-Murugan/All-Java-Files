import java.util.Scanner;

class Student{
  int id, mark1, mark2, mark3, total;
  Student(int id, int m1, int m2, int m3){
    this.id = id;
    this.mark1 = m1;
    this.mark2 = m2;
    this.mark3 = m3;
    total = mark1+mark2+mark3;
  }
  public void setMark1(int m1) {
    this.mark1 = m1;
  }
}

class MarksOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n, id, m1, m2, m3, bt, bti, bm1i, bm2i, bm3i;
    n = in.nextInt();
    Student[] s = new Student[n];
    for(int i = 0; i < n; i++){
      id = in.nextInt();
      m1 = in.nextInt();
      m2 = in.nextInt();
      m3 = in.nextInt();
      s[i] = new Student(id, m1, m2, m3);
    }
    m1 = s[0].mark1; m2 = s[0].mark2; m3 = s[0].mark3; bt = s[0].total; bti = s[0].id; bm1i = s[0].id; bm2i = s[0].id; bm3i = s[0].id;
    for(int i = 0; i < n; i++){
      System.out.println(s[i].total);
      if(bt < s[i].total){
        bt = s[i].total;
        bti = s[i].id;
      }
      if(m1 < s[i].mark1){
        m1 = s[i].mark1;
        bm1i = s[i].id;
      }
      if(m2 < s[i].mark2){
        m2 = s[i].mark2;
        bm2i = s[i].id;
      }
      if(m3 < s[i].mark3){
        m3 = s[i].mark3;
        bm3i = s[i].id;
      }
    }
    System.out.printf("%d %d\n%d %d\n%d %d\n%d %d\n", bm1i, m1, bm2i, m2, bm3i, m3, bti, bt);
  }
}
