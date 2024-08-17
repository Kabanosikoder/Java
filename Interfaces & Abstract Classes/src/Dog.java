public class Dog extends Animal implements iPettable{

    public static int dogToYearMultiplier = 7;

    public Dog(String picture, String name, int age) {
        super(picture, name, age);
    }

    public void woof(){
        System.out.println(this.name + " just woofed!!!");

    }

    public int getAgeinHumanYears(){

        return this.age * Dog.dogToYearMultiplier;
    }

    public static void outputDog(Dog dog){
        System.out.println(dog.name);
    }

    @Override
    public void make_sound() {
        System.out.println(this.name + " just woofed");
    }

    @Override
    public void pet() {
        System.out.println(this.name + " had his belly scrached :D");
    }
}
