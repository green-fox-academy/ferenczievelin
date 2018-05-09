public class Main {
    public static void main(String[] args) {
        Student johnny = new Student("John", 20 , Person.Gender.male);
        try {
            Student fakejohnny = (Student) johnny.clone();
            System.out.println(fakejohnny.name);
        } catch (CloneNotSupportedException e) {
            System.out.println("don't clone that, k?");
        }



    }
}
