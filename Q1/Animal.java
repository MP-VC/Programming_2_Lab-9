package Q1;

public abstract class Animal {
    String name;

    public abstract void greets();

    @Override
    public String toString() {
        return "Animal:[name=" + name + "]";
    }
}
