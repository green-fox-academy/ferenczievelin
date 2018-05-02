

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed="Swiss shepherd";
        dog1.color="white";
        dog1.name="Furkesz";
        dog1.age=2;
        dog1.hasOwner=true;

        Dog dog2 = new Dog();
        dog2.breed="Golden retriver";
        dog2.color="golden";
        dog2.name= "Buksi";
        dog2.age = 3;

        Dog dog3 = new Dog("german shepherd", "black", "Karak", 1,false);

        Shelter shelter = new Shelter();
        shelter.name = "Greenfox";
        shelter.dogs.add(dog1);
        shelter.dogs.add(dog2);

        System.out.println(shelter.dogs.get(0).name);

        Person jozsi = new Person("Jozsi", 50, dog1);

        jozsi.dog = shelter.dogs.get(0);
        shelter.adopt(jozsi,1);


    }
}
