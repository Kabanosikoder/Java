public class Dog {
    // Adding fields to Dog Class
    public String picture;
    public String name;
    public int age;

    //Default Constructor//
    public Dog() {

    }

    //To create a new Object we need a Custom Constructor
    // right click --> "Generate" --> "Constructor" --> select all
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void woof(){
        System.out.println(this.name + " just woofed!!!");

    }

}
