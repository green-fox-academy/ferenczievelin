
import java.util.ArrayList;


public class Farm  {
    static ArrayList<Animal> animals;
    int slots;

    Farm () {
        animals = new ArrayList<>();
    }

    public void breed(Animal child) {
        if (slots > 0) {
            animals.add(child);
        }
    }

    public void slaughter() {
        Animal minHunger = animals.get(0);
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < minHunger.hunger) {
                minHunger = animals.get(i);
            }
        }
        animals.remove(minHunger);
    }


    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal kitten = new Animal();
        Animal doggo = new Animal();
        Animal angusBeef = new Animal();

        kitten.hunger = 20;
        kitten.name = "cirmi";
        doggo.hunger = 21;
        doggo.name = "bloki";
        angusBeef.hunger = 1;
        angusBeef.name = "burger";

        animals.add(kitten);
        animals.add(doggo);
        animals.add(angusBeef);

        farm.slaughter();
        for (Animal animal: animals) {
            System.out.println(animal.name);
        }
    }
}
