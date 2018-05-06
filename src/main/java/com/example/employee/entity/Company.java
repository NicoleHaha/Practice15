package com.example.employee.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Company")
public class Company implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "employeesNumber")
    private int employeesNumber;

    public Company(){}
    public Company(int id,String companyName,int employeesNumber){
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public void setId(int id){ this.id = id;    }
    public void setCompanyName(String companyName){ this.companyName = companyName;    }
    public void setEmployeeNumber(int employeesNumber){ this.employeesNumber = employeesNumber;    }

    public int getId(){return this.id;}
    public String getCompanyName(){return this.companyName;}
    public int getEmployeesNumber(){return this.employeesNumber;}
}
