package se331.rest.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {
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
