package hng_java_boilerplate.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInDto {

    @NotBlank(message = "cannot be empty")
    private String email;

    @NotBlank(message = "cannot be empty")
    private String password;
}
