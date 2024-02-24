// Access Modifiers(specifier)

public class OOPS3 {

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.username = "Yash"; // it is allowed to access because of public
        System.out.println(myAcc.username);
        // myAcc.password="Yash"; // it is not allowed to access because of private

        myAcc.setPassword("Yash");
        // by using this function we can change(set) the values
        // but by this we can only change(set) the value can not access still password
        // because of private

    }
}

// Private , default , Protected , Public .
class BankAccount {
    public String username;
    // private String password;
    public String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}