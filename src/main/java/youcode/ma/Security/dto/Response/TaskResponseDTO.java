package youcode.ma.Security.dto.Response;

import java.util.Date;
import java.util.Set;

public record TaskResponseDTO(Long id,
                              String name,
                              String description,
                              Date startDate,
                              Date endDate,
                              UserResponseDTO createdBy,
                              UserResponseDTO assignedBy,
                              UserResponseDTO assignedTo,
                              String status,
                              Set<TagResponseDTO> tags) {
}
