package se331.rest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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




    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

}
