package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    @Autowired
    @Qualifier("dept1")
    private Department department;

    private String name;
    private Integer age;
    private Double salary;



    @PostConstruct
    public void turnOn(){
        System.out.println("Load operating system");
    }

    @PreDestroy
    public void turnOff(){
        System.out.println("Close all programs");
    }
    public Double getSalary() {
        return salary;
    }
    @Autowired(required = false)
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Autowired(required = false)
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
   @Autowired(required = false)
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "naem='" + name + '\'' +
                ", age=" + age + " ,Salary="+salary +" ,"+department +
                '}';
    }
}
