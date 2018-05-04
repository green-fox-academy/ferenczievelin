public class Person {
    String name;
    int age;

    public enum Gender {
        male,
        female
    }

    Gender gender;

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = Gender.female;
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + "old " + gender + ".");
    }

    void getGoal() {
        System.out.println("My goal is : Live for the moment. :) ");
    }

}
