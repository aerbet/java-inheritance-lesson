public class Cat extends Fellini {
    
    private String name;
    
    public Cat(double weight, boolean isDead, String name) {
        super(18, weight, isDead);

        this.name = name;
    }
    
    @Override
    protected void makeSound() {
        System.out.println("Meow...");;
    }
    
    @Override
    public String toString() {
        return "{Name: " + name + ", " + "weight: " + weight + "}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getLifeExpectancy() {
        return super.getLifeExpectancy();
    }
}
