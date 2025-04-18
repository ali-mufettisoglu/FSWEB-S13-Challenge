package org.example;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public void setId(long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public Employee(long id,String fullName,String email,String password,String[] healthPlans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }

    public String toString(){
        return "id: "+id+" name: "+fullName+" email: "+email+" password: "+password+" healthplans: "+ Arrays.toString(healthPlans);
    }

    public void addHealthPlan(int index, String name) {
        if(index < 0){
            System.out.println("index developer dizisinde mevcut değildir.");
        }
        else if(healthPlans[index] == null){
            healthPlans[index] = name;
        } else {
            System.out.println("index değeri developer dizisinde doludur.");
        }
    }
}
