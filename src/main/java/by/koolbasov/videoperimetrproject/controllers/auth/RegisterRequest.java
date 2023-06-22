package by.koolbasov.videoperimetrproject.controllers.auth;

import by.koolbasov.videoperimetrproject.dto.AddressDto;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private AddressDto addressDto;
}
