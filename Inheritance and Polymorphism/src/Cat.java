public class Cat extends Animal {

    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }
    @Override
    public void make_sound() {
        System.out.println(this.name + " just meowed");
    }

}
