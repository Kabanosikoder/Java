public class AquaticMammal extends Animal{

    public AquaticMammal(String picture, String name, int age, double weight, String habitat, boolean isEndangered) {
        super(picture, name, age, weight, habitat, isEndangered);
    }

    public static boolean canSwim;

    static {
        canSwim = true;
    }

    public int swimSpeed;

    @Override
    public void move() {
        System.out.println(this.name + " is swimming at " + swimSpeed);

    }
}
