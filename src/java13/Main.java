package java13;

public class Main {
    static {
        System.out.println("GSoC Aspirant 2020");
    }

    public static void main(String[] args) {
        System.out.println(getDay(1));
    }
    private static String getDay(int number){
        String weekday="";
        switch (number){
            case 2:
                //yield "One or two";
            default:
                weekday ="Its none of the above";

        }
        return weekday;
    }
}
