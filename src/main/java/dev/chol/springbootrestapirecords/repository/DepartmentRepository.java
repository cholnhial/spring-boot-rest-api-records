package dev.chol.springbootrestapirecords.repository;

import dev.chol.springbootrestapirecords.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
