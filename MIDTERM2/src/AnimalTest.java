interface Animal{
    void speak();
}
class Dog implements Animal{
    public void speak(){
        System.out.println("Woof!");
    }
}
class Cat implements Animal{
    public void speak(){
        System.out.println("Meow!");
    }
}
class Pig implements Animal{
    public void speak(){
        System.out.println("Oink!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Pig p = new Pig();

        Animal [] animals = {d, c,p};
        for(Animal a: animals)
            a.speak();
    }
}
