class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color2 = "black";

    void printColor() {
        System.out.println(color);
        this.color = "grey";
        System.out.println(super.color);// prints color of Animal class
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }
}
