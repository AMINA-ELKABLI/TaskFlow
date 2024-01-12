package youcode.ma.Security.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import youcode.ma.Security.entities.Role;
import youcode.ma.Security.repository.RoleRepository;
import youcode.ma.Security.service.RoleService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(Role role) {
        roleRepository.findByName(role.getName()).ifPresent(r -> {
            throw new IllegalArgumentException("Role name already exists");
        });
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Long roleId, Role updatedRole) {
        Role existingRole = roleRepository.findById(roleId)
                .orElseThrow(() -> new NoSuchElementException("Role not found"));

        existingRole.setName(updatedRole.getName());
        // Mettez à jour les champs nécessaires

        return roleRepository.save(existingRole);
    }

    @Override
    public void deleteRole(Long roleId) {
        if (!roleRepository.existsById(roleId)) {
            throw new NoSuchElementException("Role not found");
        }
        roleRepository.deleteById(roleId);
    }

    @Override
    public Role getRoleById(Long roleId) {
        return roleRepository.findById(roleId)
                .orElseThrow(() -> new NoSuchElementException("Role not found"));
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
