package myproject;

public class Bank implements  Runnable {
    public synchronized void accountbalance(double balance){
        double myacc = balance*2.5;
        System.out.println("Standing Balance is : "+myacc);
    }
    public static synchronized <E> void mycall(E [] irray){
        for (E element:irray
             ) {
            System.out.printf("%s",element+" \n");

        }
    }

    //@Override
    public <G>void run(G []value) {
        for (G values: value)
            System.out.printf("%s", values);

    }

    @Override
    public void run() {
        System.out.println("Threading!!");
    }
}
