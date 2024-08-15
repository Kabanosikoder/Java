public class Main {
    public static void main(String[] args) {

        Animal testAnimal = new Animal("animal.png","Goober",7, 76,"The unbearable void of space", true );
        testAnimal.makeSound();

        AquaticMammal dolphin = new AquaticMammal("dolphin.png", "Azure",28,110,"Oceans, seas and rivers",true);
        dolphin.swimSpeed = 60;
        dolphin.move();
        dolphin.eat();

        LandMammal ferret = new LandMammal("ferret.img", "Bandit",2,2,"forests, mountains, farmlands, semi-desert, steppe",true);
        ferret.runningSpeed = 25;
        ferret.move();
        ferret.birthday();
        System.out.println(ferret.age);



    }
}