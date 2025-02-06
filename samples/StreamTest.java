package samples;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        //Find the details of highest paid employee in the organization.
        //
        //  Employee: id,name,salary;

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("name1", 001, 1000));
        employees.add(new Employee("name2", 003, 1012));
        employees.add(new Employee("name3", 002, 1022));
        employees.add(new Employee("name4", 004, 1011));


        Employee employee = employees.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).findFirst().get();
        System.out.println("Salary: " + employee.getSalary());

    }


}

