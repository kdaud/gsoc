package myproject;

public class Lecturer {
    Bank name;
    Lecturer(Bank a){
       this.name=a;
    }
    public void run(){
        name.accountbalance(500.44);
    }
}
