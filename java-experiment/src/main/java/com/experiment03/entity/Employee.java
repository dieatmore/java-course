package com.experiment03.entity;

import com.experiment03.Workable;

public abstract class Employee implements Workable {
    public String name;
    public double basesalary;

    public Employee(String name, double basesalary) {
        this.name = name;
        this.basesalary = basesalary;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return basesalary;
    }

    public double getBaseSalary() {
        return basesalary;
    }

    public void setBaseSalary(double basesalary) {
        this.basesalary = basesalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
