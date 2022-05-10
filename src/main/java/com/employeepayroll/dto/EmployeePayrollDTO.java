package com.employeepayroll.dto;

import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is Invalid")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;
    @Min(value = 500, message = "min wage should be more than 500")
    public Long salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public String profilePic;
    public List<String> department;

}

