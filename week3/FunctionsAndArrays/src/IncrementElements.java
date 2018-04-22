public class IncrementElements {
    // Create an array variable named `t`
//with the following content: `[1, 2, 3, 4, 5]`
    //          - Increment the third element
//Print the third element
    public static void main(String... args) {
        int[] t = {1, 2, 3, 4, 5};
        for (int i = 0; i < t.length; i++) {
            if (i == 2) {
                t[i] ++;
            }
        }
        System.out.println(t[2]);
    }
}