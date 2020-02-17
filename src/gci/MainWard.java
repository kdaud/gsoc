package gci;

import java.io.*;

public class MainWard {
    public void showpatient() throws IOException, InterruptedException {
        Patient obj = new Patient();
        obj.setId(101);
        obj.setName("Harrient");
        obj.setSymptoms("Caugh");
        obj.setDiagonosis("Flou");
        File myfile = new File("patient.txt");
        FileOutputStream fileInputStream = new FileOutputStream(myfile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);
       objectOutputStream.writeObject(obj);
    }
}
