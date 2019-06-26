package info.dataseek.xe_connector.service.implementation;

import info.dataseek.xe_connector.dataobject.User;
import info.dataseek.xe_connector.service.IUserService;
import org.jasypt.encryption.StringEncryptor;
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
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    @Transactional
    public void saveTest() {
        User newRecord = new User();
        newRecord.setUserId("jenksxxx");
        newRecord.setFirstName("Jenks");
        newRecord.setLastName("Guo");
        newRecord.setEmail("jenksguo@dataseek.info");
        newRecord.setPassword(stringEncryptor.encrypt("abc12334"));
        newRecord.setContactNumber("1234567890");
        User result = userService.save(newRecord);
        Assert.assertNotNull(result);
    }
}