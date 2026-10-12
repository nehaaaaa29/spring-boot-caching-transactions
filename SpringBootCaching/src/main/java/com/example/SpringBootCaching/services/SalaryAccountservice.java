package com.example.SpringBootCaching.services;

import com.example.SpringBootCaching.entities.Employee;
import com.example.SpringBootCaching.entities.SalaryAccount;

public interface SalaryAccountservice {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
