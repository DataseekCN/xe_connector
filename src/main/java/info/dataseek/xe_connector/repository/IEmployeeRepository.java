package info.dataseek.xe_connector.repository;

import info.dataseek.xe_connector.dataobject.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<EmployeeInfo, Integer> {
}
