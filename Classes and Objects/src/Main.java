public class Main {
    public static void main(String[] args) {
        /*Classes and Objects*/

        //Using the DEFAULT CONSTRUCTOR
        Dog dawg = new Dog();
        System.out.println(dawg.name);

        Dog goober = new Dog("goober.img", "Goober", 6);
        System.out.println(goober.name);
        System.out.println(goober.age);

        Dog silly = new Dog("silly.img", "Silly", 2);
        System.out.println(silly.name);
        System.out.println(silly.age);

        goober.woof();
        silly.woof();

        goober.age = 10;
        System.out.println(goober.age);

    }
}