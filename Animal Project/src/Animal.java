public class Animal {

    public String picture;
    protected String name;
    protected int age;
    protected double weight;
    protected String habitat;
    protected boolean isEndangered;

    public Animal(String picture, String name, int age, double weight, String habitat, boolean isEndangered) {
        this.picture = picture;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    public void makeSound(){
        System.out.println(this.name + " just made a sound");

    }

    public void eat(){
        System.out.println(this.name + " is eating");
        System.out.println(this.name + " says yummy");

    }

    public void move(){
        System.out.println(this.name + " just busted a move");

    }

    public void birthday() {
        this.age++;

    }

}
