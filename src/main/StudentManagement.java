import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 85));
        students.add(new Student(102, "Priya", 72));
        students.add(new Student(103, "Amit", 35));

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        for (Student student : students) {
            student.display();

            if (student.isPassed()) {
                System.out.println("Status: PASS");
            } else {
                System.out.println("Status: FAIL");
            }

            System.out.println();
        }

        System.out.println("Total Students: " + students.size());
    }
}