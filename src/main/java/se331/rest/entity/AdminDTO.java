package se331.rest.entity;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminDTO {
    Long id;
    String name;
}