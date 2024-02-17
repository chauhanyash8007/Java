// static keyword

public class OOPS11 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.SchoolName = "SS";

        // Student s2 = new Student();
        // System.out.println(s2.SchoolName);

        // Student s3 = new Student();
        // s3.SchoolName = "ABC";

    }
}

class Student {

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;
    static String SchoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
