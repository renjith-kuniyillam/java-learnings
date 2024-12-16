package com.ems.employee_mgmt.service.impl;

import com.ems.employee_mgmt.dto.EmployeeDto;
import com.ems.employee_mgmt.entity.Employee;
import com.ems.employee_mgmt.exception.ResourceNotFoundException;
import com.ems.employee_mgmt.mapper.EmployeeMapper;
import com.ems.employee_mgmt.repository.EmployeeRepository;
import com.ems.employee_mgmt.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        var employee = EmployeeMapper.toEntity(employeeDto);
        employee = employeeRepository.save(employee);
        return EmployeeMapper.toDto(employee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee not found"));
        return EmployeeMapper.toDto(employee);
    }

    /**
     * Retrieves all employees from the repository, converts them to EmployeeDto objects,
     * and returns them as a list.
     *
     * @return a list of EmployeeDto objects representing all employees.
     */
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> employees = employeeRepository.findAll().stream()
                .map(EmployeeMapper::toDto)
                .toList();
        return employees;
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee with employee id " + id + " not found"));
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        employee = employeeRepository.save(employee);
        return EmployeeMapper.toDto(employee);
    }

    @Override
    public boolean deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee with employee id " + id + " not found"));
        employeeRepository.delete(employee);
        return true;
    }
}
