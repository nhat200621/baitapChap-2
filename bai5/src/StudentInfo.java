import java.util.Arrays;
class Student {
    private String name;
    private int age;
    private double[] marks;
    public Student(String name, int age, double[] marks) {
        this.name = name;
        this.age = age;
        this.marks = Arrays.copyOf(marks, marks.length);
    }
    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Average Marks: %.2f%n", calculateAverage());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5, 88.0, 92.0};
        Student student = new Student("John Doe", 20, marks);
        student.displayInfo();
    }
}


