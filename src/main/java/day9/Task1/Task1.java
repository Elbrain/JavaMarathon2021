package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Alex", "javaCourse");
        Teacher teacher = new Teacher("Vova", "Java");
        student.printInfo();
        teacher.printInfo();
    }
}
