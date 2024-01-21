package dev.chol.springbootrestapirecords.dto;

import java.math.BigDecimal;

public record EmployeeDTO(Long id, String fullName, BigDecimal salary, String departmentName) {
}
