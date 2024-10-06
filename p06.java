// 6. Create a class Employee with subclasses Permanent and Temporary to calculate salaries.
class Employee {
    int Empid;
    String name, Designation;

    Employee(int Empid, String name, String Designation) {
        this.Empid = Empid;
        this.name = name;
        this.Designation = Designation;
    }
}

class Permanent extends Employee {
    double BP, GP, NP;

    Permanent(int Empid, String name, String Designation, double BP) {
        super(Empid, name, Designation);
        this.BP = BP;
        calculateSalary();
    }

    void calculateSalary() {
        double DA = 0.15 * BP;
        double HRA = 8000;
        double Bonus = 0.05 * DA;
        GP = BP + DA + HRA + Bonus;
        NP = GP - (0.02 * GP) - 1250;
    }

    void displaySalary() {
        System.out.println("Gross Pay: " + GP);
        System.out.println("Net Pay: " + NP);
    }
}

class Temporary extends Employee {
    double Salary_per_hour, Total_hours, Total_salary;

    Temporary(int Empid, String name, String Designation, double Salary_per_hour, double Total_hours) {
        super(Empid, name, Designation);
        this.Salary_per_hour = Salary_per_hour;
        this.Total_hours = Total_hours;
        calculateSalary();
    }

    void calculateSalary() {
        Total_salary = Salary_per_hour * Total_hours;
    }

    void displaySalary() {
        System.out.println("Total Salary: " + Total_salary);
    }
}

public class p06 {
    public static void main(String[] args) {
        Permanent permanentEmployee = new Permanent(101, "Alice", "Manager", 50000);
        System.out.println("Permanent Employee Salary:");
        permanentEmployee.displaySalary();

        Temporary temporaryEmployee = new Temporary(102, "Bob", "Intern", 100, 40);
        System.out.println("\nTemporary Employee Salary:");
        temporaryEmployee.displaySalary();
    }
}
/* 
Output:
Permanent Employee Salary:
Gross Pay: 65450.0
Net Pay: 63441.0

Temporary Employee Salary:
Total Salary: 4000.0
*/
