package hieupham.net.tuan01.repository;

import hieupham.net.tuan01.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}
