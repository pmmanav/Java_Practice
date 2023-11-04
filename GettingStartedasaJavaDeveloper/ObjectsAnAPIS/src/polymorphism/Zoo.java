package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog(); 
        sasha.makeSound();       // it call makeSound() from dog class
        //sasha.fetch();          // can not call uninherited methods(fetch()) of Dog class. Will give error. Can only call Animal class methods
        ((Dog)sasha).fetch();       // This will execute because we have typecasted Animal into dog class.
        sasha = new Cat();      // Here polyorphism is happening.
        sasha.makeSound();      // result => meows
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food.");
        }
        else if(animal instanceof Cat){
            System.out.println("Here is your cat food.");
        }
    }
}
