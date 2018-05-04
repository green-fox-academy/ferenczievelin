public class Mentor extends Person {
    public enum Level {
        junior,
        intermediate,
        senior
    }

    Level level;

    Mentor(String name, int age, Gender gender, Level level) {
        this.name = name;
        this.level = level;
        this.age = age;
        this.gender = gender;

    }

    Mentor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = Gender.female;
        this.level = Level.intermediate;
    }



    void getGoal() {
        System.out.println("My goal is: Teach brilliant junior software developers");
    }


    void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " old " + level + " level mentor.");
    }
}
