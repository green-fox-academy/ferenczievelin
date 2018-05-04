public class Mentor extends Person {
    public enum Level {
        junior,
        intermediate,
        senior
    }

    Level level;

    Mentor(String name, int age, Level level) {

    }

    Mentor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = Gender.female;
        this.level = Level.intermediate;
    }


    @Override
    void getGoal(String name, int age, Gender gender) {
        System.out.println("Teach brilliant junior software developers");
    }

    @Override
    void introduce(String name, int age, Gender gender) {
        System.out.println("Hi, I'm " + name + ", a " + age + " old " + level + " level mentor.");
    }
}
