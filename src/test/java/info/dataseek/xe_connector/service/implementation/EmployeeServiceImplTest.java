package info.dataseek.xe_connector.service.implementation;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import info.dataseek.xe_connector.service.IEmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private IEmployeeService employeeService;

    @Test
    @Transactional
    public void createTest() {
        EmployeeInfo record = new EmployeeInfo("John Doe",0,"Cleaner", "Africa");
        EmployeeInfo result = employeeService.save(record);
        Assert.assertNotNull(result);
    }

    @Test
    public void findAll() {
    }
}