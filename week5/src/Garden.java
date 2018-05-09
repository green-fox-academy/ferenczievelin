
import java.util.ArrayList;


public class Garden {
    static ArrayList<Plant> plants;
    static ArrayList <Plant> thirstyPlants;
    static double waterAmount;



    public Garden() {
        plants = new ArrayList<>();

    }

    public static ArrayList<Plant> thirstyPlants() {
        thirstyPlants = new ArrayList<Plant>();
        for (int i = 0; i < plants.size(); i++) {
            if (Plant.currentWater < Plant.neededWater) {
                thirstyPlants.add(plants.get(i));
            }
        }
        return thirstyPlants;
    }
    static void printthirsty (ArrayList <Plant> thirstyPlants) {
        for (int i = 0; i <thirstyPlants.size() ; i++) {

            System.out.println((thirstyPlants.get(i).color + thirstyPlants.get(i).type + " needs water"));
        }
    }


    void waterPlants (double waterAmount) {
            double waterPerPlant = waterAmount/thirstyPlants.size();
        for (int i = 0; i < thirstyPlants.size(); i++) {
            Plant.currentWater += (waterPerPlant * thirstyPlants.get(i).absorbationAbility);
        }

    }
}

