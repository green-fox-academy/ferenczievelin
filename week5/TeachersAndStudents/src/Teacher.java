public class Teacher {

    public void answer () {
        String answer = "Google it, kiddo...";
        System.out.println(answer);
    }
    public void teach (Student student) {
        System.out.println("Hey kids, this is the material for today");
        student.learn();
    }

}
