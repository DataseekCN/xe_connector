package info.dataseek.xe_connector.service;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IEmployeeService {


    EmployeeInfo save(EmployeeInfo employeeInfo);
    Page<EmployeeInfo> findAll(Pageable pageable);
}
