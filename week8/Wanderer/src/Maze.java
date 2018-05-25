import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Maze {
   static ArrayList<ArrayList<java.lang.Character>> map;

    Maze() {
        map();

    }

    public static ArrayList<ArrayList<java.lang.Character>> map() {
        Level level1 = new Level();
        level1.level= "level0.txt";
          map = new ArrayList<>();
        try {

            ArrayList<ArrayList<java.lang.Character>> characters = new ArrayList<>();
            ArrayList<String> lines =
                    (ArrayList<String>) Files.readAllLines(Paths.get(level1.level));

            ArrayList<java.lang.Character> lineInChars;
            for (String line : lines) {
                lineInChars = new ArrayList<>();
                for (char actChar : line.toCharArray()) {
                    lineInChars.add(actChar);
                }
                map.add(lineInChars);
            }

        } catch (IOException e) {
            System.out.println("upsey happened");
        }
        return map ;
    }

    public void drawMaze(Graphics graphics) {

        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.get(i).size(); j++) {
                {
                    if (map.get(i).get(j).equals('p')) {
                        PositionedImage path = new PositionedImage("floor.png", i * 72, j * 72);
                        path.draw(graphics);


                    } else {
                        PositionedImage wall = new PositionedImage("wall.png", i * 72, j * 72);
                        wall.draw(graphics);
                    }

                }
            }

        }
    }

}