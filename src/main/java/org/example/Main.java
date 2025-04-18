package org.example;

import org.example.enums.Plan;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(1,"B sigorta", Plan.BASIC);
        String[] healthplans = new String[2];
        healthplans[0]= healthplan.getName();
        Employee employee = new Employee(1,"John Doe","johndoe@email.com","doejohn",healthplans);
        String[] employees = new String[2];
        employees[0] = employee.getFullName();
        Company company = new Company(1,"Company",2500000, employees);
        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan);
        System.out.println(Plan.BASIC.getPrice());

    }
}