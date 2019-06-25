package info.dataseek.xe_connector.repository;

import info.dataseek.xe_connector.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
}
