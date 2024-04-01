package com.experiment03;

import com.experiment03.entity.Manager;
import com.experiment03.entity.Seller;
import com.experiment03.service.SalaryService;

public class Test {
    public static void main(String[] args) {
        Workable manager = new Manager("di", 2, 5000);
        Workable seller = new Seller("zhao", 20000, 0.15, 3000);
        Workable[] employee = {manager, seller};
        double ansSalary = 0;
        ansSalary = SalaryService.getTotalSalaries(employee);
        System.out.println(ansSalary);
    }
}
