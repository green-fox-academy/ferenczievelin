public class Pirate {
    int intoxication;
    boolean isDead;
    boolean passedout;
    String rank;

    Pirate() {
        this.isDead = false;
        this.intoxication = 0;
        this.rank = "crew";
    }

    void drinkSomeRum() {
        if (!isDead)
            intoxication++;
    }

    void howIsitGoingMate() {
        if (!isDead) {
            if (intoxication <= 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passout();
            }
        }
    }

    public void passout() {
        passedout = true;
    }

    public void die() {
        isDead = true;
    }

    void brawl(Pirate pirate1, Pirate pirate2) {
        int odds = (int) (Math.random() * 3);
        if (odds == 0) {
            pirate1.isDead = true;
        } else if (odds == 1) {
            pirate2.isDead = true;
        } else {
            pirate1.passout();
            pirate2.passout();
        }
    }
}
