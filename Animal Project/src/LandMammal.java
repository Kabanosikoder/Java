public class LandMammal extends Animal{


    public LandMammal(String picture, String name, int age, double weight, String habitat, boolean isEndangered) {
        super(picture, name, age, weight, habitat, isEndangered);
    }

    public static boolean canWalk;

    static {
        canWalk = true;
    }

    public int runningSpeed;

    @Override
    public void move() {
        System.out.println(this.name + " is moving at " + runningSpeed);

    }
}
