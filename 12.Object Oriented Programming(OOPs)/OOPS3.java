public class OOPS3 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Yash";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        // System.out.println(s1.name);
        // Student s2 = new Student("Yash");
        // Student s3 = new Student(123);
        // Student s4=new Student("Yash",123); it given an error because this type of
        // constructors is not available

        // copy constructors
        // copy of s1 = s2
        Student s2 = new Student(s1);
        s2.password = "XYZ";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    public String name;
    public int roll;
    public String password;
    public int marks[];

    // Declaration of constructors
    // Student(String name) {
    // this.name = name;
    // }

    // non-parameterized constructors
    Student() {
        marks = new int[3];
        System.out.println("constructors is called ");
    }

    // parameterized constructors
    Student(String name) {
        marks = new int[3];

        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];

        this.roll = roll;
    }

    // shallow copy constructors
    // Student(Student s1) {
    // marks = new int[3];

    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructors

    Student(Student s1) {
        marks = new int[3];

        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

}
