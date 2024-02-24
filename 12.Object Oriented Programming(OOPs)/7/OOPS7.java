// Constructor
// Types of constructor
// 1.non-parameterized  Constructor
// 2.parameterized Constructor
// 3.copy constructor
// 3(a). shallow copy constructor
// 3(b). Deep copy constructor

// we can also see polymorphism in constructors

// if we do not define(declare) constructor java will create a default constructor byHimSelf

public class OOPS7 {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("Yash");
        System.out.println(s2.name);

        Student s3 = new Student(5);
        System.out.println(s3.roll);

    }
}

class Student {
    String name;
    int roll;

    // non-parameterized Constructor

    Student() {
        System.out.println("constructor is called");
    }

    // parameterized Constructor

    Student(String newName) {
        this.name = newName;
    }

    Student(int roll) {

        this.roll = roll;
    }
}