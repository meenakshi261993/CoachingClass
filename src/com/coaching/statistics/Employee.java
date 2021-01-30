package com.coaching.statistics;

import java.time.LocalDate;

public class Employee {
    String name;
    int id;
    int age;
    Double salary;
    String department ;
    LocalDate joiningDate;

    public Employee(String  name, int id, int age, Double salary, String department, LocalDate date){
        this.name =name;
        this.id= id;
        this.age=age;
        this.salary=salary;
        this.department=department;
        this.joiningDate=date;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }

}
