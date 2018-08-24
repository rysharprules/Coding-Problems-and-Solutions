import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFName() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String ...args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            List<Student> students = new ArrayList<>();

            while (testCases > 0) {
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student student = new Student(id, fname, cgpa);
                students.add(student);

                testCases--;
            }
            students.sort(Comparator
                    .comparing(Student::getCgpa)
                    .reversed()
                    .thenComparing(Student::getFName)
                    .thenComparing(Student::getId));
            students.stream()
                    .forEach(student -> System.out.println(student.getFName()));
        }
    }
}