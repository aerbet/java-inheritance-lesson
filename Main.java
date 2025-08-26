public class Main {
    
    public static void main(String[] args) {
        Cat cat = new Cat(7, false, "Bomba");
        
        Dog dog = new Dog(15, 30, false, true, "Sigma", "Lahom");

        RiverFrog frog = new RiverFrog(5, 0.5 , false);

        cat.makeSound();
        dog.makeSound();
        frog.makeSound();

        Circle c = new Circle(3);      
        System.out.println("Площадь круга: " + c.getArea());
        System.out.println("Периметр круга: " + c.getPerimeter());

        Rectangle r = new Rectangle(5, 3);
        System.out.println("Площадь прямоугольника: " + r.getArea());
        System.out.println("Периметр прямоугольника: " + r.getPerimeter());
    }
}
