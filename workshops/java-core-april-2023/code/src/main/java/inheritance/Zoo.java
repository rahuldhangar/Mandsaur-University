package inheritance;

public class Zoo {
    public static void main(String[] args) {
//        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();

        // Polymorphism
        Animal sasha = new Dog();
//        sasha.makeSound();

//        sasha = new Cat();
//        sasha.makeSound();
//        sasha.fetch();
        sasha = new Cat();
//        ((Dog)sasha).fetch();
        ((Cat)sasha).scratch();
        feed(sasha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog) {
            System.out.println("Here's your dog food");
        }
        if(animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }
}
