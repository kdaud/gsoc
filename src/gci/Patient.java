package gci;

import java.io.Serializable;

public class Patient implements Serializable {
    private int id;
    private String name;
    private String diagonosis;
    private String symptoms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagonosis() {
        return diagonosis;
    }

    public void setDiagonosis(String diagonosis) {
        this.diagonosis = diagonosis;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
