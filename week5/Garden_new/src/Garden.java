
import java.util.ArrayList;

    public class Garden {
        static ArrayList<Plant> plants;
        static ArrayList<Plant> thirstyPlants;
        static double waterAmount;

        public Garden() {

            this.plants = new ArrayList();
        }

        public static ArrayList<Plant> thirstyPlants() {
            thirstyPlants = new ArrayList();

            for(int i = 0; i < plants.size(); i++) {
                if (plants.get(i).currentWater < plants.get(i).neededWater) {
                    thirstyPlants.add(plants.get(i));
                }
            }

            return thirstyPlants;
        }
        static void printthirsty(ArrayList <Plant> thirstyPlants) {
            for (int i = 0; i <thirstyPlants.size() ; i++) {
                System.out.println(thirstyPlants.get(i).color + thirstyPlants.get(i).type);
            }

        }

        void waterPlants(double waterAmount) {
            double waterPerPlant = waterAmount / (double)thirstyPlants.size();

            for(int i = 0; i < thirstyPlants.size(); ++i) {
                thirstyPlants.get(i).currentWater += waterPerPlant * (thirstyPlants.get(i)).absorbationAbility;
            }

        }
}
