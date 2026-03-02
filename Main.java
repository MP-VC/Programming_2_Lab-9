import Q1.*;
import Q2.*;

public class Main {
    public static void main(String[] args) {
        
        //Q1
        Dog dog = new Dog("asasas");
        Cat cat = new Cat("sasasa");
        dog.greets();
        System.out.println(cat.toString());

        //Q2
        Visit visit = new Visit("john doe", null);
        visit.setProductExpense(4);
        visit.setServiceExpense(3);
        System.out.println(visit.toString());
    }
}