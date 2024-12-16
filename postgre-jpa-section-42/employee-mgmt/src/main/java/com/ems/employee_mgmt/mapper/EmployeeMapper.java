package com.ems.employee_mgmt.mapper;

import com.ems.employee_mgmt.dto.EmployeeDto;
import com.ems.employee_mgmt.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto toDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    public static Employee toEntity(EmployeeDto dto) {
        Employee entity = new Employee();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
