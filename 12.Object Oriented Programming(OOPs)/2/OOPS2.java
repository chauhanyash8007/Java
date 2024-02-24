// public is a keyword which is also called access specifier

// Here Encapsulation is used

// public class OOPS2 {
// public static void main(String[] args) {

// Pen p1 = new Pen(); // Pen(); it is called constructors (created a pen object
// called p1) <----
// important
// p1.setColor("Blue");
// System.out.println(p1.getColor());
// p1.setTip(5);
// System.out.println(p1.getTip());
// p1.setColor("Yellow"); // we can change as many times we want (1st method)
// System.out.println(p1.getColor());

// p1.color = "Yellow"; // we can even write just like this (2nd method)
// p1.setColor("Yellow");
// System.out.println(p1.color);
// System.out.println(p1.getColor());

// **************************************************************************

// BankAccount myAcc = new BankAccount();

// myAcc.username = "Yash"; // it is allowed to access because of public
// myAcc.password="Yash"; // it is not allowed to access because of private

// myAcc.setPassword("Yash"); // by using this function we can change(set) the
// values
// but by this we can only change(set) the value can not access still password
// because of private

// }

// }

// created a class name called pen
// always write classes below public class
// blueprint for pen

// pen class
// class Pen {
// private String color; // properties
// private int tip;
// Getters who return the value
// this = keyword is used to refer to current object

// String getColor() {
// return this.color;
// }

// int getTip() {
// return this.tip;
// }

// Setters = who set (modify the value)
// void setColor(String newColor) { // functions
// this.color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// void setTip(int tip) { // this.tip shows real pen's tip which we created int
// tip; like

// this.tip = tip; // tip that we pass in function which is new tip is called
// external variable
// }

// }

// class student

// class Student {
// String name;
// int age;
// float percentage;

// void calculatePercentage(int phy, int che, int math) {
// percentage = (phy + che + math) / 3;
// }

// }

// access specifier (Modifier)
// Private , default , Protected , Public .
// class BankAccount {
// public String username;
// private String password;
// public String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }