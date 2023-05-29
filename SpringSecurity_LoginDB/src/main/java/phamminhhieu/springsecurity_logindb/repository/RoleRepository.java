package phamminhhieu.springsecurity_logindb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phamminhhieu.springsecurity_logindb.model.Role;

import java.util.Optional;
import java.util.Map;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
