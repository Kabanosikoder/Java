import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        Cat jinx = new Cat("jinx.png", "Jinx", 2);

        bengie.make_sound();
        jinx.make_sound();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(jinx);

        animals.get(1).make_sound();
        // Animal animal1 = new Animal; does not work


        List<iPettable> pets = new ArrayList<>();
        pets.add(bengie);
        pets.add(gracie);
        pets.add(jinx);
        // pets.add(animal); not every animal is pettable, abstraction...

        pets.add(new Bird("pigeon.img", "Pigeon", 14));

        for(iPettable pet : pets){
            pet.pet();
        }

        // iFly flying = (iFly)gracie;
        // flying.fly();                doesn't work cuz not implemented in dog class
    }
}