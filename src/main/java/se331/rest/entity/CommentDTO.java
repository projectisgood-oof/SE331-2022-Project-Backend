package se331.rest.entity;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    Long id;
    String comment;
    DocterChainPatientDTO docter;
    PatientChainDTO patients;
}