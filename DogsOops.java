
import java.util.Scanner;

class Dogs{
  private String name, breed;
  public String getBreed() { 
    return breed; 
  }
  public String getName(){
    return name;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }
  public void setName(String name) { 
    this.name = name;
  }
}

class DogsOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String name, breed, type;
    int n = in.nextInt();
    Dogs[] d = new Dogs[n];
    for(int i = 0; i < n; i++){
      d[i] = new Dogs();
      name = in.next();
      breed = in.next();
      d[i].setName(name);
      d[i].setBreed(breed);
    }
    for(int i = 0; i < n; i++){
      type = (d[i].getBreed().equals("Labrador"))?"arrogant":"nice";
      System.out.printf("%s is a %s which is %s\n",d[i].getName(), d[i].getBreed(), type);
    }
  }
}