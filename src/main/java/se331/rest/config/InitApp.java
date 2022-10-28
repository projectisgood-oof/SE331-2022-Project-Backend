
package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.entity.Doctor;
import se331.rest.entity.Event;
import se331.rest.repository.DoctorRepository;
import se331.rest.repository.EventRepository;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Doctor doc1,doc2,doc3;
        doc1 = doctorRepository.save(Doctor.builder().name("Dr'Pop").build());
        doc2 = doctorRepository.save(Doctor.builder().name("Dr'Pon").build());
        doc3 = doctorRepository.save(Doctor.builder().name("Dr'Phone").build());
        Event tempEvent;
        tempEvent = eventRepository.save(Event.builder()

                .name("Jevan")
                .surname("Wilson")
                .homeTown("907 Pennington Lane Ankeny, IA 50023")
                .age("29")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Janssen")
                .commentTest("comment-1")
                .build());

        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Evelyn")
                .surname("Horne")
                .homeTown("8657 Prairie Drive Reynoldsburg, OH 43068")
                .age("52")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-2")
                .build());

        tempEvent.setDoctor(doc2);
        doc2.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Tara")
                .surname("Hastings")
                .homeTown("9728 North Ridgewood Drive Randallstown, MD 21133")
                .age("16")
                .vaccinateStatus("Second dose")
                .firstDose("Moderna")
                .secondDose("Sinopharm")
                .commentTest("comment-3")
                .build());

        tempEvent.setDoctor(doc3);
        doc3.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Will")
                .surname("Dickens")
                .homeTown("7826 Prince Rd. Newark, NJ 07103")
                .age("37")
                .vaccinateStatus("Second dose")
                .firstDose("Oxford")
                .secondDose("Janssen")
                .commentTest("comment-4")
                .build());

        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Daniel")
                .surname("Lees")
                .homeTown("231 Bedford Street Canal Winchester, OH 43110")
                .age("21")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-5")
                .build());

        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Farzana")
                .surname("Rennie")
                .homeTown("7578 NW. Green Street Taunton, MA 02780")
                .age("65")
                .vaccinateStatus("Second dose")
                .firstDose("Sputnik V")
                .secondDose("Janssen")
                .commentTest("comment-6")
                .build());

        tempEvent.setDoctor(doc2);
        doc2.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Ishaaq")
                .surname("Brook")
                .homeTown("494 Wintergreen St. Berwyn, IL 60402")
                .age("17")
                .vaccinateStatus("First dose")
                .firstDose("Sinopharm")
                .secondDose("-")
                .commentTest("comment-7")
                .build());

        tempEvent.setDoctor(doc3);
        doc3.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Mia-Rose")
                .surname("Zamora")
                .homeTown("8400 Inverness Avenue Boca Raton, FL 33428")
                .age("12")
                .vaccinateStatus("First dose")
                .firstDose("Pfizer")
                .secondDose("-")
                .commentTest("comment-8")
                .build());

        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Yvette")
                .surname("Hendricks")
                .homeTown("3 Smith Drive Kingsport, TN 37660")
                .age("42")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Oxford")
                .commentTest("comment-9")
                .build());

        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()

                .name("Aleeza")
                .surname("Alford")
                .homeTown("723 North Carson Dr. Owensboro, KY 42301")
                .age("26")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Pfizer")
                .commentTest("comment-10")
                .build());
        tempEvent.setDoctor(doc1);
        doc1.getOwnEvents().add(tempEvent);

    }
}