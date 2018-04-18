

public class Summing {
    public static void main (String... args){
        // - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
        int [] numbers = {2,4,3,6};
        System.out.println(sum(numbers));

    }

    private static int sum(int... numbers) {
        int sum = 0;
        for (int numtosum:numbers) {
            sum+=numtosum;

        }
       return sum;
    }

}
