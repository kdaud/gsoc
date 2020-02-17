package gci;

public class Generic {
    public static void main(String[] args) {
      print("Godfrey Magari");
      print('r');
      print(39.0);
    }
    public static <V> void print(V obj){
        String name;
        name=String.valueOf(obj);
        System.out.println(name.toUpperCase());
    }
}
