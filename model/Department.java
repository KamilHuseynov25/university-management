package model;
/*
DepartmentId
Which Department enum
number of employee
Email
Location
 */

import util.Enums;

public class Department {
    private int departmentId;
    private Enums.DepartmentType department;
    private Building building;
    private int numberOfEmployees;
    private String email;
    public float budget;
    public float expenses;

    public Department(int departmentId, Enums.DepartmentType department, Building building, int numberOfEmployees, String email, float budget, float expenses) {
        this.departmentId = departmentId;
        this.department = department;
        this.building = building;
        setNumberOfEmployees(numberOfEmployees);
        setEmail(email);
        setBudget(budget);
        setExpenses(expenses);
    }
    public Boolean IsOverspending(){
        return getBudget()>getExpenses();
    }
    
    public float calculateDeficitOrSurplus() {
        return budget - expenses;
    }

    public float calculateBudgetPerEmployee() {
        if (numberOfEmployees == 0) return 0;
        return budget / numberOfEmployees;
    }

    public boolean isValidEmail() {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Enums.DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(Enums.DepartmentType department) {
        this.department = department;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
    

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department Details:\n");
        sb.append("Department ID: ").append(departmentId).append("\n");
        sb.append("Department Type: ").append(department != null ? department : "N/A").append("\n");
        sb.append("Building: ").append(building != null ? building.getBuildingName() : "N/A").append("\n");
        sb.append("Number of Employees: ").append(numberOfEmployees).append("\n");
        sb.append("Email: ").append(email != null ? email : "N/A").append("\n");
        sb.append("Budget: ").append(budget).append("\n");
        sb.append("Expenses: ").append(expenses).append("\n");
        sb.append("Status: ").append(IsOverspending() ? "Overspending" : "Within Budget").append("\n");
        return sb.toString();
}



}
