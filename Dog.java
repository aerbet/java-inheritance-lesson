public class Dog extends Canini {

    protected String breed;
    protected String name;

    public Dog(int lifeExpectancy, double weight, boolean isDead, boolean tooth, String breed, String name) {
        super(lifeExpectancy, weight, isDead, tooth);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gaw gaw...");
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", " + "weight: " + weight + "}";
    }
}
