import java.awt.*;
import java.util.Random;

public class Character {
    int level;
    int healthPoint, strikePoint, defendPoint;
    int d6;
    PositionedImage image;

    Character () {
        Random random = new Random();
        d6 = random.nextInt(5)+1;
    }

    boolean isDead() {
        if (healthPoint <= 0) {
            return true;
        } else return false;
    }

    public void drawCharacter(Graphics graphics) {


    }
}
