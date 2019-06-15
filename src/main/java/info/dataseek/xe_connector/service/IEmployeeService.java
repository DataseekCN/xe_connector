package info.dataseek.xe_connector.service;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IEmployeeService {


    EmployeeInfo save(EmployeeInfo employeeInfo);
    Page<EmployeeInfo> findAll(Pageable pageable);
    List<EmployeeInfo> findAll();
}
