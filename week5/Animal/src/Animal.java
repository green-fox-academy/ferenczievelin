public class Animal {

    int hunger;
    int thurst;

    Animal() {
        this.hunger = 50;
        this.thurst = 50;
    }

    public int eat() {
        this.hunger--;
        return hunger;
    }

    public int drink() {
        this.thurst--;
        return thurst;
    }

    public void play() {
        this.thurst++;
        this.hunger++;
    }
}
