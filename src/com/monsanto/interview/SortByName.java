package com.monsanto.interview;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1 == null || o2 == null){
            return -2;
        }

        if(!((o1 instanceof Employee) && (o2 instanceof Employee))){
            return -2;
        }
        
       Employee e1 = (Employee) o1;
       Employee e2 = (Employee) o2;
       
       String nameOne = e1.getName();
       String nameTwo = e2.getName();
       
       int result = nameOne.compareTo(nameTwo);

       return result;
    }

}
