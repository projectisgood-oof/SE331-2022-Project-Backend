package se331.rest.security.entity;


import lombok.*;
import se331.rest.entity.AuthDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Long id;
    String username;
    String email;
    String firstname;
    String lastname;
    List<AuthDTO> authorities;
}