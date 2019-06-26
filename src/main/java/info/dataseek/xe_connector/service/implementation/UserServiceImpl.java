package info.dataseek.xe_connector.service.implementation;

import info.dataseek.xe_connector.dataobject.User;
import info.dataseek.xe_connector.repository.IUserRepository;
import info.dataseek.xe_connector.service.IUserService;
import info.dataseek.xe_connector.utils.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Override
    public User save(User user) {
        user.setId(KeyUtil.generateUniqueKey());
        return repository.save(user);
    }
}
