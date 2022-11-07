package se331.rest.entity;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientAuthDTO {
    Long id;
    String name;
    List<String> authorities;
}
