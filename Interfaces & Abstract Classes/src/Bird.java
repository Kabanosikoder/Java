public class Bird extends Animal implements iPettable, iFly {

    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void make_sound() { //implemented
        System.out.println(this.name + " just chirped");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " flaps its wings");

    }

    @Override
    public void pet() {
        System.out.println(this.name + " enjoys your gentle pets");

    }
}
