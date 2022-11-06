package se331.rest.entity;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientCommentDTO {
    Long id;
    String comment;
    DocterCommentDTO comBy;
}
