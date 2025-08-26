public class Main {
    
    public static void main(String[] args) {
        Cat cat = new Cat(7, false, "Bomba");
        
        System.out.println(cat);
        
        Dog dog = new Dog(15, 30, false, true, "Sigma", "Lahom");

        System.out.println(cat.hashCode());
        System.out.println(cat);
        cat.makeSound();
        System.out.println(dog);
        dog.makeSound();
    }
}
