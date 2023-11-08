package com.example.RestAPIUnitTest;

import com.example.RestAPIUnitTest.Entity.Employee;
import com.example.RestAPIUnitTest.Repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
//only scan @Repository and @Entity
public class EmployeeRepoTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmployeeTest(){
        //creating instance of Employee
        Employee employee = Employee.builder()
                .firstName("Bikash")
                .lastName("Ghale")
                .email("ghalebikash445@gmail.com")
                .build();

        employeeRepository.save(employee);

        //Testing if id exist then id will be greater than 0
        Assertions.assertThat(employee.getId()).isGreaterThan(0);

    }

}
