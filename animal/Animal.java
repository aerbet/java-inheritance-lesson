package animal;
public class Animal {

    protected int lifeExpectancy;
    protected double weight;
    protected boolean isDead;

    public Animal(int lifeExpectancy, double weight, boolean isDead) {
        this.lifeExpectancy = lifeExpectancy;
        this.weight = weight;
        this.isDead = isDead;
    }

    protected void makeSound() {
        System.out.println("...");
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
}