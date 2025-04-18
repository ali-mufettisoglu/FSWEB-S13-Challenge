package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro < 0)
            giro = 0;
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String toString(){
        return "id: "+id+" name: "+name+" giro: "+giro+" developer-names: "+ Arrays.toString(developerNames);
    }

    public void addEmployee(int index, String name) {
        if(index < 0){
            System.out.println("index developer dizisinde mevcut değildir.");
        }
        else if(developerNames[index] == null){
            developerNames[index] = name;
        } else {
            System.out.println("index değeri developer dizisinde doludur.");
        }
    }
}
