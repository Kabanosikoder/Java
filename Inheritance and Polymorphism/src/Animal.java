public class Animal {

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

    public void make_sound(){
        System.out.println(this.name + " just made a sound");

    }
    public int getAge() {
        return age;
    }

}
