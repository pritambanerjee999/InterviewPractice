package com.monsanto.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrangeByName{

    public static void main(String args[]){
        Employee eOne = new Employee();
        Employee eTwo = new Employee();
        Employee eThree = new Employee();
        Employee eFour = new Employee();
        Employee eFive = new Employee();

        eOne.setName("Pritam");
        eTwo.setName("Babui");
        eThree.setName("Poda");
        eFour.setName("Tukai");
        eFive.setName("Akash");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(eOne);
        employeeList.add(eTwo);
        employeeList.add(eThree);
        employeeList.add(eFour);
        employeeList.add(eFive);
        
        for(Employee e: employeeList){
            System.out.println(e.getName());
        }
        
       SortByName sbn = new SortByName();
       Collections.sort(employeeList, sbn);
       
        for(Employee e: employeeList){
            System.out.println(e.getName());
        }

    }

}