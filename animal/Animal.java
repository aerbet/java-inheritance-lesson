package animal;
public abstract class Animal {

    protected int lifeExpectancy;
    protected double weight;
    protected boolean isDead;

    protected Animal(int lifeExpectancy, double weight, boolean isDead) { // абстрактный конструктор нужно скрывать с помощью protected
        this.lifeExpectancy = lifeExpectancy;
        this.weight = weight;
        this.isDead = isDead;
    }

    public abstract void makeSound();

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
}