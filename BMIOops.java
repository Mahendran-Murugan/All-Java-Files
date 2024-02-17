import java.util.Scanner;

class BMI{
  float res;
  void bmi(int n,float m){
    res = n / (m * m); 
  }
}

public class BMIOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    float w = in.nextFloat();
    BMI b = new BMI();
    b.bmi(l, w);
    char grade = ' ';
    if(b.res < 18.5f){
      grade ='U';
    }else if(b.res < 25.0f){
      grade ='N';
    }else if(b.res < 30.0f){
      grade ='H';
    }else if(b.res >= 30.0f){
      grade ='O';
    }
    System.out.println(grade);
  }
}