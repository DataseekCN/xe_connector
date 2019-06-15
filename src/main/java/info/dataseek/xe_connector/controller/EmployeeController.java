package info.dataseek.xe_connector.controller;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import info.dataseek.xe_connector.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list")
    public List<EmployeeInfo> getAllEmployee() {
        return employeeService.findAll();
    }
}
