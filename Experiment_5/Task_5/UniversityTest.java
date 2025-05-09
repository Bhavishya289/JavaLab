class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Staff extends Person {
    protected int staffId;
    protected String department;

    public Staff(String name, int age, String address, int staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId + ", Department: " + department);
    }
}

class Professor extends Staff {
    private String specialization;

    public Professor(String name, int age, String address, int staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person {
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }
}

class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " is submitting thesis on " + researchTopic);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        Person[] people = {
                new Professor("Dr. Smith", 50, "New York", 101, "CS", "AI"),
                new GraduateStudent("Alice", 24, "Boston", 202, "M.Tech", "Deep Learning")
        };

        for (Person p : people) {
            p.displayDetails();
            System.out.println();
        }
    }
}

