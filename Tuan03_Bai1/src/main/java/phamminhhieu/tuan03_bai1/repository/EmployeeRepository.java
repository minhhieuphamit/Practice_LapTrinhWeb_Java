package phamminhhieu.tuan03_bai1.repository;

import phamminhhieu.tuan03_bai1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
