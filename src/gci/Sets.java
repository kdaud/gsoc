package gci;

import java.util.*;

public class Sets {
    public void mycode(){
        String [] students={"John","Paul","Adam","Paul","Aaron"};
        List<String> mylist = Arrays.asList(students);
        System.out.printf("%s",mylist);
        System.out.println();
        System.out.println("----------");
        Set<String>set = new HashSet<>(mylist);
        System.out.printf("%s ",set);
        System.out.println();
        for(String ss: set){
            System.out.printf("%s ",ss);
        }
    }

    public static void main(String[] args) {
        new Sets().mycode();
    }
}
