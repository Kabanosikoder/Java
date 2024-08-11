public class Main {
    public static void main(String[] args) {
        /*Classes and Objects*/

        //Using the DEFAULT CONSTRUCTOR
        Dog dawg = new Dog();
        System.out.println(dawg.name);

        Dog goober = new Dog("goober.img", "Goober", 6);
        Dog.outputDog(goober);

        Dog silly = new Dog("silly.img", "Silly", 2);
        System.out.println(silly.name);
        System.out.println(silly.getAge());


        goober.woof();
        silly.woof();

        System.out.println(goober.getAgeinHumanYears());
    }
}