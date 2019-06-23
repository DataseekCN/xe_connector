package info.dataseek.xe_connector.repository;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IEmployeeInfoRepositoryTest {

    @Autowired
    private IEmployeeRepository repository;

    @Test
    @Transactional
    public void createTest() {
        EmployeeInfo newRecord = new EmployeeInfo("John Doe", 1, "Junior Developer", "China");
        EmployeeInfo result = repository.save(newRecord);
        Assert.assertNotNull(result);
    }

//    @Test
//    public void findOneTest() {
//        EmployeeInfo target = repository.findById(1).get();
//        Assert.assertEquals("陶尚明", target.getEmployeeName());
//    }
//
//    @Test
//    public void findAllTest() {
//        List<EmployeeInfo> result = repository.findAll();
//        Assert.assertEquals(5, result.size());
//    }
//
//    @Test
//    @Transactional
//    public void updateTest() {
//        EmployeeInfo target = repository.findById(1).get();
//        target.setGender(0);
//        repository.save(target);
//        Assert.assertEquals(0, target.getGender().intValue());
//    }
//
//    @Test
//    @Transactional
//    public void deleteTest() {
//        repository.deleteById(1);
//        int size = repository.findAll().size();
//        Assert.assertEquals(4,size);
//    }
}