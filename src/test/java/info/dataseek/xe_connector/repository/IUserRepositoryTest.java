package info.dataseek.xe_connector.repository;

import info.dataseek.xe_connector.dataobject.User;
import info.dataseek.xe_connector.utils.KeyUtil;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserRepositoryTest {

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    @Transactional
    public void createTest() {
        User user = new User();
        user.setId(KeyUtil.generateUniqueKey());
        user.setUserId("user3301");
        user.setUserName("user 3301");
        user.setEmail("user3301@dataseek.info");
        String plainPassword = "iwork@dataseek";
        user.setPassword(stringEncryptor.encrypt(plainPassword));
        user.setContactNumber("0420002000");
        User testResult = userRepository.save(user);
        Assert.assertNotNull(testResult);
    }

    @Test
    @Transactional
    public void removeTest() {
        String id = "1561465397985191625";
        userRepository.deleteById(id);
    }
}