
package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Event;
import se331.rest.repository.EventRepository;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    EventRepository eventRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        eventRepository.save(Event.builder()
                .id(1L)
                .name("Jevan")
                .surname("Wilson")
                .homeTown("907 Pennington Lane Ankeny, IA 50023")
                .age("29")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Janssen")
                .commentTest("comment-1")
                .build());

        eventRepository.save(Event.builder()
                .id(2L)
                .name("Evelyn")
                .surname("Horne")
                .homeTown("8657 Prairie Drive Reynoldsburg, OH 43068")
                .age("52")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-2")
                .build());
        eventRepository.save(Event.builder()
                .id(3L)
                .name("Tara")
                .surname("Hastings")
                .homeTown("9728 North Ridgewood Drive Randallstown, MD 21133")
                .age("16")
                .vaccinateStatus("Second dose")
                .firstDose("Moderna")
                .secondDose("Sinopharm")
                .commentTest("comment-3")
                .build());
        eventRepository.save(Event.builder()
                .id(4L)
                .name("Will")
                .surname("Dickens")
                .homeTown("7826 Prince Rd. Newark, NJ 07103")
                .age("37")
                .vaccinateStatus("Second dose")
                .firstDose("Oxford")
                .secondDose("Janssen")
                .commentTest("comment-4")
                .build());
        eventRepository.save(Event.builder()
                .id(5L)
                .name("Daniel")
                .surname("Lees")
                .homeTown("231 Bedford Street Canal Winchester, OH 43110")
                .age("21")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-5")
                .build());
        eventRepository.save(Event.builder()
                .id(6L)
                .name("Farzana")
                .surname("Rennie")
                .homeTown("7578 NW. Green Street Taunton, MA 02780")
                .age("65")
                .vaccinateStatus("Second dose")
                .firstDose("Sputnik V")
                .secondDose("Janssen")
                .commentTest("comment-6")
                .build());
        eventRepository.save(Event.builder()
                .id(7L)
                .name("Ishaaq")
                .surname("Brook")
                .homeTown("494 Wintergreen St. Berwyn, IL 60402")
                .age("17")
                .vaccinateStatus("First dose")
                .firstDose("Sinopharm")
                .secondDose("-")
                .commentTest("comment-7")
                .build());
        eventRepository.save(Event.builder()
                .id(8L)
                .name("Mia-Rose")
                .surname("Zamora")
                .homeTown("8400 Inverness Avenue Boca Raton, FL 33428")
                .age("12")
                .vaccinateStatus("First dose")
                .firstDose("Pfizer")
                .secondDose("-")
                .commentTest("comment-8")
                .build());
        eventRepository.save(Event.builder()
                .id(9L)
                .name("Yvette")
                .surname("Hendricks")
                .homeTown("3 Smith Drive Kingsport, TN 37660")
                .age("42")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Oxford")
                .commentTest("comment-9")
                .build());
        eventRepository.save(Event.builder()
                .id(10L)
                .name("Aleeza")
                .surname("Alford")
                .homeTown("723 North Carson Dr. Owensboro, KY 42301")
                .age("26")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Pfizer")
                .commentTest("comment-10")
                .build());

    }
}