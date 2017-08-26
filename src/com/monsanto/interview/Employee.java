package com.monsanto.interview;

import java.util.Comparator;

public class Employee {

    private String name;
    private Double employeeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + employeeId.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Double employeeId) {
        this.employeeId = employeeId;
    }

}
