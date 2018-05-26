import java.awt.*;
import java.util.Random;

public class Hero extends Character {
    public int posY;
    public int posX;
    PositionedImage image;

    Hero () {
        this.image = new PositionedImage("hero-down.png", 0, 0);
        healthPoint = 20 + 3 * d6;
        defendPoint = 2 * d6;
        strikePoint = 5 + d6;
    }







   // Hero () {
   //     PositionedImage hero = new PositionedImage("hero-down.png", 0, 0);
   // }

  //  public void draw(Graphics graphics) {
        
   // }
}