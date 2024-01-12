package youcode.ma.Security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public record UserCreateUpdateDTO(
        @NotBlank(message = "Username is required") String userName,
        @Email(message = "Email should be valid") String email,
        @NotBlank(message = "Password is required") String password,
        @NotBlank(message = "First name is required") String firstName,
        String middleName,
        @NotBlank(message = "Last name is required") String lastName,
        Set<Long> roleIds
) {
}
