package com.example.employee.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Employee implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "companyId")
    private int companyId;

    @Column(name = "salary")
    private int salary;

    public Employee() {
    }

    public Employee( String name, int age, String gender,int salary,int companyId,int id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Employee setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public int getCompanyId(){return this.companyId;}
    public void setCompanyId(int companyId){this.companyId = companyId;}

    public int getSalary(){return this.salary;}
    public void setSalary(int salary){this.salary = salary;}
}
