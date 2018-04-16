public class Cuboid {
    public static void main(String[] args) {
        double side1=33;
        double side2=20;
        double side3=18;

        double surfaceArea=2*side1*side2+2*side1*side3+2*side2*side3;
        double volume=side1*side2*side3;
        System.out.println(surfaceArea);
        System.out.println(volume);

    }
}
