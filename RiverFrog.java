import animal.Animal;

public class RiverFrog extends Animal {

    public RiverFrog(int lifeExpectancy, double weight, boolean isDead) {
        super(lifeExpectancy, weight, isDead);
    }

    @Override
    public void makeSound() {
        System.out.println("Cuak...Cuak...");
    }
    
}
