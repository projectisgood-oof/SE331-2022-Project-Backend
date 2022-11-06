package se331.rest.entity;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentPatientDTO {
    Long id;
    String name;
}
