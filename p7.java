// 7. Develop an Employee class and sort based on name.
import java.util.Arrays;

class EmployeeSort {
    String name;
    int empid;
    String dateOfJoining;

    EmployeeSort(String name, int empid, String dateOfJoining) {
        this.name = name;
        this.empid = empid;
        this.dateOfJoining = dateOfJoining;
    }

    public static void main(String[] args) {
        EmployeeSort[] employees = {
                new EmployeeSort("John", 101, "2020-01-15"),
                new EmployeeSort("Alice", 102, "2019-03-10"),
                new EmployeeSort("Bob", 103, "2021-05-25")
        };

        Arrays.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("Employees sorted by name:");
        for (EmployeeSort emp : employees) {
            System.out.println(emp.name + " " + emp.empid + " " + emp.dateOfJoining);
        }
    }
}
/* 
Output:
Employees sorted by name:
Alice 102 2019-03-10
Bob 103 2021-05-25
John 101 2020-01-15
*/
