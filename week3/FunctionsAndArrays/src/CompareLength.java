public class CompareLength {
    public static void main (String ... comparision){
        int [] p1 = {1, 2, 3};
        int [] p2 = {4, 5};

        if (p2.length>p1.length){
            System.out.println("p2 has more elements");
        } else
        {
            System.out.println("p1 is bigger or equals with p2");
        }
     }
}
