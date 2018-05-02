import java.util.ArrayList;
import java.util.List;

public class Shelter {
    String name;
    List<Dog> dogs;

    public Shelter() {
        dogs = new ArrayList<>();
    }

    public void adopt(Person person, int index) {
        person.dog = dogs.get(index);
        dogs.get(index).hasOwner = true;
        dogs.remove(index);
    }
}

