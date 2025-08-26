import animal.Animal;

public class Fellini extends Animal {

    protected boolean nightVision;
    
    public Fellini(int lifeExpectancy, double weight, boolean isDead) {
        super(lifeExpectancy, weight, isDead);
        this.nightVision = true;
    }


}