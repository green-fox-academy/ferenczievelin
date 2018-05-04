public class Sponsor extends Person {

    String company;
    int hiredStudents;

    Sponsor (String name, int age, Gender gender, String company) {
        this.hiredStudents = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
    }

    Sponsor () {
        this.name = "Jane Doe";
        this.company = "Google";
        this.age = 30;
        this.gender = Gender.female;
        this.hiredStudents = 0;
    }

    @Override
    void introduce() {
        System.out.println(" Hi, I'm " + name + " from " + company + ", and I hired " + hiredStudents + " students so far.");
    }

    public int hire () {
        hiredStudents++;
        return  hiredStudents;
    }

    @Override
    void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
