package dev.chol.springbootrestapirecords.service;

import dev.chol.springbootrestapirecords.dto.EmployeeDTO;
import dev.chol.springbootrestapirecords.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream().map(e -> new
                EmployeeDTO(e.getId(), e.getName(), e.getSalary(), e.getDepartment().getName())).toList();
    }

}
