import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class Maze {
    String path;
    public static int rows;
    public static int columns;
    public static int[][] cells;

    public Maze(String path) {
        this.path = path;
    }

    public Maze () {

    }

    public static int [][] map (String filename) throws IOException {
     //   int[][] map = new int[10][10];

        {
            Scanner scan = new Scanner(new File("level0.txt"));
          int  numRows = scan.nextInt();
          int  numColumns = scan.nextInt();
         int [][]   mazeArray = new int[numRows][numColumns];


            for(int row = 0; row < numRows; row++)
            {
                String strings = scan.next();

                for(int column = 0; column < numColumns; column++)
                {
                    mazeArray[row][column] = strings.charAt(row);
                    System.out.print(mazeArray[row][column]);
                }
                System.out.print("\n");
            }

        catch (Exception e) {
            System.out.println(e);
        }
        return mazeArray;

    }

    void drawTheMaze (Graphics graphics) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
        //        if (map[i][j])

            }
            
        }

    }

}
