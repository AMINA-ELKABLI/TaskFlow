package youcode.ma.Security.dto.Response;

import java.util.Set;

public record UserResponseDTO(
        Long id,
        String userName,
        String email,
        String firstName,
        String middleName,
        String lastName,
        Set<CardResponseDTO> cards,
        Set<TaskResponseDTO> createdTasks,
        Set<TaskResponseDTO> assignedTasks,
        Set<TaskResponseDTO> tasks,
        Set<DemandReplacementResponseDTO> demandReplacements,
        Set<RoleResponseDTO> roles
) {
}
