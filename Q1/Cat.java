package Q1;

public class Cat extends Mammal {

    public Cat() {
        name = "";
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(Cat cat) {
        name = cat.name;
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat:[" + super.toString() + "]";
    }
}
