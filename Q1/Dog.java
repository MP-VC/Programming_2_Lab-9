package Q1;

public class Dog extends Mammal {

    public Dog() {
        name = "";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(Dog dog) {
        name = dog.name;
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog dog) {
        System.out.println("Woooof");
    }
}
