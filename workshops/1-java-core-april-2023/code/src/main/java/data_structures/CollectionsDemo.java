package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queueDemo();
//        mapDemo();
    }
    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("mango");

        fruits.add("banana");
        fruits.remove("lemon");

        System.out.println(fruits);

        Set moreFruit = Set.of("raisin", "date", "pear", "cherry", "strawberry");
//        moreFruit.add("kiwi");
        System.out.println(moreFruit);
    }
    public static void listDemo(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("mango");

        fruits.add("lemon");
        fruits.remove("orange");

        fruits.set(1,"grape");

        System.out.println(fruits);
        List moreFruit = List.of("date", "cherry", "mango");
        moreFruit.add("apple");
        System.out.println(moreFruit);
    }
    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("mango");


        System.out.println(fruits);
        Object removed = fruits.remove();
        System.out.println("Removed: " + removed);
        System.out.println(fruits);
    }
    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 85);
        fruitCalories.put("lemon", 22);
        fruitCalories.put("banana",105);
        fruitCalories.put("mango",65);

        System.out.println(fruitCalories);
        fruitCalories.put("banana", 110);
//        fruitCalories.put("banana", 55);
        System.out.println(fruitCalories);
        fruitCalories.remove("lemon");
        fruitCalories.putIfAbsent("banana",20);
        fruitCalories.putIfAbsent("grape",10);
        System.out.println(fruitCalories);

        Map moreFruitCalories = Map.of(
                "dragonfruit", 200,
                "apple", 95,
                "kiwi", 125
        );
//        moreFruitCalories.put("banana", 115);

        System.out.println(moreFruitCalories);
    }
}
