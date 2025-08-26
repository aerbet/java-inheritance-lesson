import animal.Animal;

public class Canini extends Animal {

    
    protected boolean tooth;
    
    public Canini(int lifeExpectancy, double weight, boolean isDead, boolean tooth) {
        super(lifeExpectancy, weight, isDead);
        this.tooth = tooth;
    }
}
