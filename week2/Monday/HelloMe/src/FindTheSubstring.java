public class FindTheSubstring {
    public static void  main (String ... args){
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
        String string1= "Hello world";
        String string2 = "lo";
        System.out.println(subStr(string1, string2));
    }

    public static int subStr(String input, String q) {

        if (input.contains(q))
            return input.indexOf(q);

        else return -1;
    }
}

