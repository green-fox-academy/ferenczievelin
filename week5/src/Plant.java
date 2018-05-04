public class Plant {
    String color;
    String type;
    double currentWater;
    double neededWater;
    double absorbedWater;
    boolean thirsty;
    double absorbationAbility;


    Plant() {
        this.currentWater = 0;
        this.thirsty = true;


    }

    public void wannaDrink() {
        if (currentWater < neededWater) {
            thirsty = true;
            System.out.println(type + " " + color + " needs water.");
        }

    }

}
