import java.util.Scanner;

class Person{
  int age;
  String name;
  Person(int age, String name){
    this.age = age;
    this.name = name;
  }
}

class PersonOops{
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
     for(int i = 0; i < n; i++) System.out.printf("Name %s with age %d\n", p[i].name, p[i].age);
   }
}