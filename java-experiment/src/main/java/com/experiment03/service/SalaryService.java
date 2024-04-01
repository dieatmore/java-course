package com.experiment03.service;

import com.experiment03.Workable;

public class SalaryService {
    public static double getTotalSalaries(Workable[] employee) {
        double ansSalary = 0;
        for (Workable i : employee) {
            ansSalary += i.calculateSalary();
        }
        return  ansSalary;
    }
}
