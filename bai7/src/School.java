class Person {
    // Thuộc tính của Person
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Person {
    private String subject;    // Môn dạy
    private double salary;     // Lương
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.printf("Salary: %.2f%n", salary);
    }
}
public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics", 50000);
        teacher.displayInfo();
    }
}
