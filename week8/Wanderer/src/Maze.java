import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Maze  {
   static ArrayList<ArrayList<Character>> map;
   Maze () {

   }
    public static ArrayList<ArrayList<Character>> map() {
       map = new ArrayList<>();
        try {
            ArrayList<String> lines =
                    (ArrayList<String>) Files.readAllLines(Paths.get("level0.txt"));

            ArrayList<Character> lineInChars;

            for (String line : lines) {

                lineInChars = new ArrayList<Character>();
                for (char actChar : line.toCharArray()) {
                    List<java.lang.Character> map = line.chars().mapToObj(e->(actChar)).collect(Collectors.toList());
                }

                map.add(lineInChars);
            }

        } catch (IOException e) {
            System.out.println("upsey happened");
        }
        return map;
    }
    public void drawMaze (Graphics graphics ) {


        for (int i = 0; i < map.size() ; i++) {
            for (int j = 0; j < map.get(i).size(); j++) {
                {
                    if (map.get(i).get(j).equals('p')) {
                        PositionedImage path = new PositionedImage("floor.png", i*72, j*72);
                        path.draw(graphics);


                    } else {
                        PositionedImage wall = new PositionedImage("wall.png", i*72, j*72);
                        wall.draw(graphics);

                    }

                }
            }

        }
    }
}
