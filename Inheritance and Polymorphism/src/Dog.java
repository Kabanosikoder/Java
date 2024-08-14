public class Dog extends Animal{

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
        System.out.println(dog.getAge());
    }

    @Override
    public void make_sound() {
        System.out.println(this.name + " just woofed");
    }
}
