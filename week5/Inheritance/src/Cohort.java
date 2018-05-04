import java.util.ArrayList;

public class Cohort {
    String cohortName;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    Cohort(String cohortName) {
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
        this.cohortName = cohortName;
    }

    public ArrayList<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public ArrayList<Mentor> addMentor(Mentor mentor) {
        mentors.add(mentor);
        return mentors;
    }

    void info() {
        System.out.println(cohortName + " has " + students.size() + " students, and " + mentors.size() + " mentors.");
    }
}
