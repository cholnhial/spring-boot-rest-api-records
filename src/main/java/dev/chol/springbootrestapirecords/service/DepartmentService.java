package dev.chol.springbootrestapirecords.service;

import dev.chol.springbootrestapirecords.domain.Department;
import dev.chol.springbootrestapirecords.dto.DepartmentDTO;
import dev.chol.springbootrestapirecords.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Random;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentDTO formatDepartmentName(DepartmentDTO department) {
        int starCount = (new Random()).nextInt(5);

        if (department instanceof DepartmentDTO(var id, var name, var location)) {
            String formattedName = String.format("%s (%s) - %s", name,
                    location, starCount > 0 ? "⭐ ".repeat(starCount).trim() : "");
            return new DepartmentDTO(id, formattedName, location);
        }
        return null;
    }
    public List<DepartmentDTO> getAllDepartmentsWithFormattedName() {
        return departmentRepository.findAll().stream()
                .map(d -> new DepartmentDTO(d.getId(),d.getName(),
                d.getLocation()))
                .map(this::formatDepartmentName)
                .filter(Objects::nonNull)
                .toList();
    }
}
