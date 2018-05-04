import java.util.ArrayList;
import java.util.Scanner;

public class Garden {
    static ArrayList<Plant> plants;
    static double waterAmount;


    public Garden() {
        this.plants = new ArrayList<>();
    }

    public static void fillGarden() {
        Flower flower1 = new Flower("yellow");
        this.plants.add(flower1);
        Flower flower2 = new Flower("blue");
        this.plants.add(flower2);
        Tree tree1 = new Tree("orange");
        this.plants.add(tree1);
        Tree tree2 = new Tree("purple");
        this.plants.add(tree2);

    }

    public static ArrayList<Plant> thirstyPlants() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).thirsty = true) {
                thirstyPlants().add(plants.get(i));
            }
        }
        return thirstyPlants();
    }


    public static void waterPlants(double waterAmount) {
        waterAmount /= thirstyPlants().size();
        for (int i = 0; i < thirstyPlants().size(); i++) {
            thirstyPlants().get(i).currentWater += (thirstyPlants().get(i).currentWater*thirstyPlants().get(i).absorbationAbility);
        }


        public static void main (String[]args){
            fillGarden();
            Scanner scanner = new Scanner(System.in);
            System.out.println("How much water do we have");
            waterAmount = scanner.nextDouble();

        }
    }
}