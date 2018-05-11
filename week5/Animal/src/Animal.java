public class Animal {

    int hunger;
    int thurst;

    Animal() {
        this.hunger = 50;
        this.thurst = 50;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThurst() {
        return thurst;
    }

    public void setThurst(int thurst) {
        this.thurst = thurst;
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
