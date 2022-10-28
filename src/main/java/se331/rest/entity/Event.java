package se331.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String surname;
    String homeTown;
    String age;
    String vaccinateStatus;
    String firstDose;
    String secondDose;
    String commentTest;
    @ManyToOne
    Doctor doctor;
    @ManyToMany(mappedBy = "eventHistory")
    List<Participant> participants;


}
