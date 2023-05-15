package hieupham.net.tuan01;

import hieupham.net.tuan01.model.Employee;
import hieupham.net.tuan01.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tuan01Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Tuan01Application.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Hieu");
//        employee.setLastName("Pham");
//        employee.setEmailId("mail1@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Hieu1");
//        employee1.setLastName("Pham1");
//        employee1.setEmailId("mail2@gmail.com");
//        employeeRepository.save(employee1);
    }
}
