package se331.rest.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocterCommentDTO {
    Long id;
    String name;
}
