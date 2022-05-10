package com.employeepayroll.model;

import com.employeepayroll.dto.EmployeePayrollDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_payroll")
public @Data @NoArgsConstructor class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "employee_department",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> department;


    public EmployeePayrollData(EmployeePayrollDTO employeePayrollData) {
        this.employeeId = employeeId;
        this.name = employeePayrollData.name;
        this.salary = employeePayrollData.salary;
        this.gender= employeePayrollData.gender;
        this.startDate= employeePayrollData.startDate;
        this.note= employeePayrollData.note;
        this.profilePic= employeePayrollData.profilePic;
        this.department = employeePayrollData.department;
    }

}