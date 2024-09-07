abstract class fruit {
    abstract void fruitInfo();

    void typeOfFood() {
        System.out.println("Fruit");
    }
}

class Mango extends fruit {
    @Override
    void fruitInfo() {
        System.out.println("Mango");
    }
}

interface Pet {
    abstract void eat();

    abstract void run();

    abstract void sleep();

    default void creatureType() {
        System.out.println("Pet");
    }
}

class Doggy implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void creatureType() {
        Pet.super.creatureType();
    }
}

public class Day2Testing2 extends Doggy {
    public static void main(String[] args) {
        fruit day2 = new Mango();
        day2.fruitInfo();
        day2.typeOfFood();
        System.out.println(day2 instanceof Mango);
        Day2Testing2 d = new Day2Testing2();
        d.creatureType();
    }
}
