package youcode.ma.Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Permission;

public interface PermissionRepository extends JpaRepository <Permission, Long> {
}
