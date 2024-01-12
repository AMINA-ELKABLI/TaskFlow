package youcode.ma.Security.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public record RoleCreateUpdateDTO(
        @NotBlank(message = "Role name is required") String name,
        Set<Long> permissionIds // Permissions are optional, no validation needed
) {
}
