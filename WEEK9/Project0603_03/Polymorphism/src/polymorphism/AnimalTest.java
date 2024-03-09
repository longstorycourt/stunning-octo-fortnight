package polymorphism;

import java.util.ArrayList;

abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Woof woof!");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow meow!");
    }
}
class Pig extends Animal{
    public void sound(){
        System.out.println("Oink oink!");
    }
}
class Horse extends Animal{
    public void sound(){
        System.out.println("Neighhhh!");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Dog d = new Dog();
        list.add(d);
        Cat c = new Cat();
        list.add(c);
        Pig p = new Pig();
        list.add(p);
        Horse h = new Horse();
        list.add(h);

        // for(Animal a: list) //for each loop
        //     a.sound();

        for(int i=0; i<list.size(); i++)
            list.get(i).sound();
    }
}
