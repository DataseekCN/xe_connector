package info.dataseek.xe_connector.service.implementation;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import info.dataseek.xe_connector.repository.IEmployeeRepository;
import info.dataseek.xe_connector.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements IEmployeeService {

    @Autowired
    private IEmployeeRepository repository;

    @Override
    public EmployeeInfo save(EmployeeInfo employeeInfo) {
        return repository.save(employeeInfo);
    }

    @Override
    public Page<EmployeeInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<EmployeeInfo> findAll() {
        return repository.findAll();
    }
}
