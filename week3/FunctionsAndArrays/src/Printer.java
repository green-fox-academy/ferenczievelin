public class Printer {
    public static void main(String... printing) {
        String p1 = "apple";
        String p2 = "pear";
        printer(p1, p2);


    }

    public static String printer(String... params) {

        System.out.println(params);
        return params.toString();
    }

}
