// Classes &  Object

public class OOPS1 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.color = "Yellow";
        System.out.println(p1.color);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// class student

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int che, int math) {
        percentage = (phy + che + math) / 3;
    }

}