package Opgave11_2;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;
    public Employee(String name, String address, String phoneNumber, String email, String office, int salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "Office: " + getOffice() + "Salary: " + getSalary();
    }
}
