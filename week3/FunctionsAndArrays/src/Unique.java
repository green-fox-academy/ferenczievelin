import java.util.ArrayList;

public class Unique {
    public static void main (String ... args){
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        int [] unique = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(uni(unique));

        //  should print: `[1, 11, 34, 52, 61]`

    }
    public static ArrayList<Integer> uni(int [] list){
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < list.length ; i++) {

            if (!List.contains(list[i])){
                List.add(list[i]);
            }

        }
        return List;
    }
}
