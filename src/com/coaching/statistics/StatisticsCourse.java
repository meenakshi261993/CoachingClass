package com.coaching.statistics;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StatisticsCourse {

    private List<Employee> employees = new ArrayList<>(10);

    public StatisticsCourse(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployeeDetailsBasedOnAge(){
       return this.employees.stream()
               .filter(e -> (e.getAge()>=30 && e.getAge()<=40))
               .collect(Collectors.toSet());
    }

    public List<Employee> getEmployeeBasedOnJoiningDate(){
        return this.employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .filter(e -> (e.getJoiningDate().isAfter(LocalDate.parse("2018-04-01"))))
                .collect(Collectors.toList());
    }

    public Map<Integer,String> getEmployeeDetailsMap(){
       return this.employees.stream().
               collect(Collectors.toMap(Employee::getId, Employee::getName));
    }
}
