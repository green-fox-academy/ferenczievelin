
import java.util.ArrayList;


public class Farm  {
    ArrayList<Animal> animals;
    int slots;

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

    }
}
