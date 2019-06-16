package info.dataseek.xe_connector.controller;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import info.dataseek.xe_connector.service.IEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "EmployeeInfoController")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @ApiOperation(value = "员工列表")
    @GetMapping("/list")
    public List<EmployeeInfo> getAllEmployee() {
        return employeeService.findAll();
    }
}
