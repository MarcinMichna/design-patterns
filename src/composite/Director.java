package composite;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee
{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void employeeDetails()
    {
        employees.forEach(Employee::employeeDetails);
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
}
