public class Dog {

    static int idCounter = 0;
    int id;
    String breed;
    String color;
    int age;
    String name;
    boolean hasOwner;

    public Dog(String breed, String color, String name, int age, boolean hasOwner) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.hasOwner = false;
        this.id = idCounter++;

    }


    public Dog() {
        id++;
    }


}
