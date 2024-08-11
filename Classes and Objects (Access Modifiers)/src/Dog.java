public class Dog {
    // Adding fields to Dog Class
    public String picture;
    public String name;
    protected int age;
    public static int dogToYearMultiplier = 7;

    // Access Modifiers: public, protected, private
    // static = no object required to access (same variable for every instance of that class)
    // final = constant, unchanging

    public int getAge() {
        return age;
    }

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
    public void birthday() {
        this.age++;
    }
    public int getAgeinHumanYears(){

        return this.age * Dog.dogToYearMultiplier;
    }
    public static void outputDog(Dog dog){
        System.out.println(dog.name);
        System.out.println(dog.getAge());
    }
}
