import animal.Animal;

public abstract class Canini extends Animal {

    
    protected boolean tooth;
    
    public Canini(int lifeExpectancy, double weight, boolean isDead, boolean tooth) {
        super(lifeExpectancy, weight, isDead);
        this.tooth = tooth;
    }

    @Override
    public abstract void makeSound();
}
