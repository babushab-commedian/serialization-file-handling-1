public import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Marks: " + marks;
    }
}

public class StudentStreamFiltering {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Karan", 80),
            new Student("Amit", 70),
            new Student("Neha", 90),
            new Student("Ravi", 60),
            new Student("Priya", 85)
        );

        System.out.println("Students scoring above 75%, sorted by marks:");

        students.stream()
                .filter(s -> s.marks > 75)              // filter > 75%
                .sorted((s1, s2) -> Integer.compare(s1.marks, s2.marks)) // sort ascending
                .map(s -> s.name)                       // extract names
                .forEach(System.out::println);          // display
    }
}
 {
    
}
