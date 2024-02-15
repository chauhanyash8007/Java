// public is a keyword which is  also called access specifier 

public class OOPS1 {
    public static void main(String[] args) {

        Pen p1 = new Pen(); // Pen(); it is called constructors (created a pen object called p1)
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow"); // we can change as many times we want (1st method)
        System.out.println(p1.color);

        p1.color = "Yellow"; // we can even write just like this (2nd method)
        System.out.println(p1.color);

        // **************************************************************************

        BankAccount myAcc = new BankAccount();

        myAcc.username = "Yash"; // it is allowed to access because of public
        // myAcc.password="Yash"; // it is not allowed to access because of private

        myAcc.setPasswoer("Yash"); // by using this function we can change(set) the values
        // but by this we can only change(set) the value can not access still password
        // because of private

    }

}

// created a class name called pen
// always write classes below public class
// blueprint for pen

class Pen {
    String color; // properties
    int tip;

    void setColor(String newColor) { // functions
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int che, int math) {
        percentage = (phy + che + math) / 3;
    }

}

// access specifier (Modifier)
class BankAccount {
    public String username;
    private String password;

    public void setPasswoer(String pwd) {
        password = pwd;
    }
}