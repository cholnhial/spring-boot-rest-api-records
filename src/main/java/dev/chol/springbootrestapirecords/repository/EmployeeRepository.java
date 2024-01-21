package dev.chol.springbootrestapirecords.repository;

import dev.chol.springbootrestapirecords.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
