package hieupham.tuan02_bai3a.service;

import hieupham.tuan02_bai3a.model.Employee;

import java.util.List;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
