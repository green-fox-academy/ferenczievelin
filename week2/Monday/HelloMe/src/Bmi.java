public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI=0;

        // Print the Body mass index (BMI) based on these values

        BMI=massInKg/(Math.pow(heightInM,2));
        System.out.println("The BMI IS: " + BMI);
    }
}
