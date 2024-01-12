package youcode.ma.Security.service;

import youcode.ma.Security.entities.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    Role updateRole(Long roleId, Role role);
    void deleteRole(Long roleId);
    Role getRoleById(Long roleId);
    List<Role> getAllRoles();
}
