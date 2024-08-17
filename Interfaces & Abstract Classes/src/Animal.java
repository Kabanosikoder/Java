public abstract class Animal {
// abstract states that the class is ABSTRACT and thus can't be instantiated//

    public String picture;
    protected String name;
    protected int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        this.age++;

    }

    public abstract void make_sound();
    // this must be implemented in other inheriting classes or else they can't inherit from animal

}
