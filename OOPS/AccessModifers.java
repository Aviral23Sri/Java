package OOPS;

public class AccessModifers {
    public static void main(String[] args) {
        Bank u1 = new Bank();
        u1.name = "aviral";
    }
}
class Bank{
    String name;
    private int password;
}
