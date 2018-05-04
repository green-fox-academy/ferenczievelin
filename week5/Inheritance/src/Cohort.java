import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    Cohort(String name) {
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public ArrayList<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public ArrayList<Mentor> addMentor(Mentor mentor) {
        mentors.add(mentor);
        return mentors;
    }

    void info(String name, ArrayList<Student> students, ArrayList<Mentor> mentors) {
        System.out.println(name + "has " + students.size() + " students, and " + mentors.size() + " mentors.");
    }
}
