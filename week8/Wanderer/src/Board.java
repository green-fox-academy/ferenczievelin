import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    PositionedImage image = new PositionedImage("hero-down.png", 0, 0);

    public Board() {
        // testBoxX = 0;
        // testBoxY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        image.draw(graphics);

    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            image.posY -= 72;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            image.posY += 72;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            image.posX += 72;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            image.posX -= 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }



        }