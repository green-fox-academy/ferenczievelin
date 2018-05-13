import java.util.ArrayList;

public class Ship {

    public static ArrayList<Pirate> pirates;
    int numberOfLivingCrew;

    Ship() {
        this.pirates = new ArrayList<>();
    }

    public ArrayList<Pirate> fillship() {
        int numberOfCrew = (int) (Math.random() * 20);
        for (int i = 0; i < numberOfCrew; i++) {
            Pirate pirate = new Pirate();
            this.pirates.add(pirate);
        }
        this.pirates.get(0).rank = "Captain";
        return this.pirates;
    }

    int getInfo() {
        System.out.println("The captains consumed rum : " + pirates.get(0).intoxication);
        if (pirates.get(0).isDead) {
            System.out.println("The captain is dead");
        } else if (pirates.get(0).passedout) {
            System.out.println("The captain is passed out");
        } else {
            System.out.println("The captain is alive");
        }
        for (int i = 1; i < pirates.size(); i++) {
            if (!(pirates.get(i).isDead)) {
                numberOfLivingCrew++;
            }
        }
        System.out.println("There are " + numberOfLivingCrew + " crewmembers alive.");
        return numberOfLivingCrew;
    }

    int howDrunkTheCaptainIs() {
        return pirates.get(0).intoxication;
    }

    boolean battle(Ship ship) {
        int thisScore = this.numberOfLivingCrew - this.howDrunkTheCaptainIs();
        int otherScore = ship.numberOfLivingCrew - ship.howDrunkTheCaptainIs();

        if (thisScore > otherScore) {
            int deaths = (int) (1+Math.random() * ship.numberOfLivingCrew);
            for (int i = 1; i < deaths; i++) {
                ship.pirates.get(i).die();
            }
            return true;
        } else {
            int deaths = (int) (1+Math.random() * this.numberOfLivingCrew);
            for (int i = 1; i < deaths; i++) {
                this.pirates.get(i).die();
            }
        }
        return false;
    }

}

