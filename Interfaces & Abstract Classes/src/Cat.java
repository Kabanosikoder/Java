public class Cat extends Animal implements iPettable {

    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }
    @Override
    public void make_sound() {
        System.out.println(this.name + " just meowed");
    }

    @Override
    public void pet() {
        System.out.println(this.name + " purrs as you pet it");
    }
}
