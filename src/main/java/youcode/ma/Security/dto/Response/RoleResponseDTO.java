package youcode.ma.Security.dto.Response;

import java.util.Set;

public record RoleResponseDTO(
        Long id,
        String name,
        Set<PermissionResponseDTO> permissions
) {
}
