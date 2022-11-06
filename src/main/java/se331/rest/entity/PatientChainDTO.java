package se331.rest.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientChainDTO {
    Long id;
    String name;
}
