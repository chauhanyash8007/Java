
// 3.copy constructor
// 3(a). shallow copy constructor 
// in shallow copy where we only copy reference we don't make new object (here changes reflect)

// 3(b). Deep copy constructor
// in deep copy we make new array (here changes not reflect)

public class OOPS8 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yash";
        s1.roll = 123;
        s1.password = "Yc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "Y";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow - copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // this ia an array here whole array didn't copy here but here only reference
                               // copy here
    }

    Student() {
        marks = new int[3];

        System.out.println("constructor is called");
    }

    Student(String newName) {
        marks = new int[3];

        this.name = newName;
    }

    Student(int roll) {
        marks = new int[3];

        this.roll = roll;
    }
}