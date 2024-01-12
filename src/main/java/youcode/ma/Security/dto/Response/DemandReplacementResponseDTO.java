package youcode.ma.Security.dto.Response;

import java.util.Date;

public record DemandReplacementResponseDTO(
        Long id,
        TaskResponseDTO currentTask,
        TaskResponseDTO newTask,
        String description,
        Date dateDemand,
        UserResponseDTO demandedBy,
        String status
) {
}
