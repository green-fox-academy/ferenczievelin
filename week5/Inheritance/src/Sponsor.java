public class Sponsor extends Person {

    String company;
    int hiredStudents;

    Sponsor (String name, int age, String company) {
        this.hiredStudents = 0;
    }

    Sponsor () {
        this.name = "Jane Doe";
        this.company = "Google";
        this.age = 30;
        this.gender = Gender.female;
        this.hiredStudents = 0;
    }

    @Override
    void introduce(String name, int age, Gender gender) {
        System.out.println(" Hi, I'm " + name + " from " + company + ", and I hired " + hiredStudents + " students so far.");
    }

    public int hire (int hiredStudents) {
        hiredStudents++;
        return  hiredStudents;
    }

    @Override
    void getGoal(String name, int age, Gender gender) {
        System.out.println("Hire brilliant junior software developers.");
    }
}
