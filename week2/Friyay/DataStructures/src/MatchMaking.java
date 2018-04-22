import java.lang.reflect.Array;
import java.util.*;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(tinder(girls, boys));
    }
    public static ArrayList<String> tinder (ArrayList<String>girls, ArrayList<String> boys){
        ArrayList<String> pairs = new ArrayList<String>();
        for (int i = 0; i <girls.size() ; i++) {
            pairs.add(girls.get(i));
            pairs.add(boys.get(i));

        }
        return pairs;

    }
}