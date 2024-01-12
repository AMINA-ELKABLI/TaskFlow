package youcode.ma.Security.dto.Response;

public record CardResponseDTO(
        Long id,
        UserResponseDTO user,
        Integer numberOfUtilisation,
        String cardType,
        String rangeType
) {
}
