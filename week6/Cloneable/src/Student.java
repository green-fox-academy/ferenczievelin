public class Student extends Person implements Cloneable{
    String previousOrganization;
    int skippedDays;

    Student(String name, int age, Gender gender) {
        this.skippedDays = 0;
        this.gender = gender;
        this.name = name;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.age = age;
    }

    Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = Gender.female;
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    void getGoal() {
        System.out.println("Be a junior software developer");
    }

    void introduce() {
        System.out.println("Hi, my name is: " + name + ", a " + age + " old " + gender + " from " + previousOrganization + ", who skipped  " + skippedDays + "days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;
    }


}
