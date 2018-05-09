
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Garden gardenOfEden = new Garden();
       Scanner scanner = new Scanner(System.in);
       System.out.println("How much water do we have");
        Garden.waterAmount = scanner.nextDouble();
        Flower flower1 = new Flower("yellow");
        Garden.plants.add(flower1);
        Flower flower2 = new Flower("blue");
        Garden.plants.add(flower2);
        Tree tree1 = new Tree("orange");
        Garden.plants.add(tree1);
        Tree tree2 = new Tree("purple");
        Garden.plants.add(tree2);

        Garden.printthirsty(Garden.thirstyPlants());

    }
}