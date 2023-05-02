package inheritance;

import objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person p1 = new Person("Rahuld");
//        Employee e1 = new Employee();

//        Square sq1 = new Square();
//        sq1.setLength(25);
//        System.out.println(sq1.calculatePerimeter());
        Rectangle r1 = new Rectangle();
        r1.print();
        Square sq2 = new Square();
        sq2.print("Square");
        sq2.print();
    }
}
