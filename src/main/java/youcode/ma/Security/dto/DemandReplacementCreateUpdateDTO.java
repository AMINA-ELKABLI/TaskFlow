package youcode.ma.Security.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DemandReplacementCreateUpdateDTO(
        @NotNull(message = "Current task ID is required") Long currentTaskId,
        @NotNull(message = "New task ID is required") Long newTaskId,
        String description, // Description is optional
        @NotNull(message = "Demand date is required")
        @FutureOrPresent(message = "Demand date must be in the present or future") Date dateDemand,
        @NotNull(message = "Demander user ID is required") Long demandedById
) {
}
