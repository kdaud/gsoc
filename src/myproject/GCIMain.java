package myproject;

public class GCIMain {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.accountbalance(380000.0555);
        String [] students = {"Fred","George","Titus","Gilbert","Robert"};
       // obj.mycall(students);
        Bank.mycall(students);
    }
}
