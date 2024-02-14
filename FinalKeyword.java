import java.util.*;

class Person{
  private final int age;
  String name;
  Person(int age, String name){
    this.age = age;
    this.name = name;
  }
  void get(){
      System.out.printf("Name %s with age %d\n", name, age);
  }
}

class FinalKeyword{
   public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int age;
     String name;
     Person[] p;
     p = new Person[n];
     for(int i = 0; i < n; i++){
       name =  in.next();
       age = in.nextInt();
       p[i] = new Person(age, name);
     }
     for(int i = 0; i < n; i++) p[i].get();
   }
}