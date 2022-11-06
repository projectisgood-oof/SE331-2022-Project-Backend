
package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.entity.Comment;
import se331.rest.entity.Docter;
import se331.rest.entity.Patient;
import se331.rest.repository.CommentRepository;
import se331.rest.repository.DoctorRepository;
import se331.rest.repository.PatientRepository;
import se331.rest.security.entity.Authority;
import se331.rest.security.entity.AuthorityName;
import se331.rest.security.entity.User;
import se331.rest.security.repository.AuthorityRepository;
import se331.rest.security.repository.UserRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository docterRepository;

    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Docter doc1,doc2,doc3;
        doc1 = docterRepository.save(Docter.builder().name("Dr'Pop").build());
        doc2 = docterRepository.save(Docter.builder().name("Dr'Pon").build());
        doc3 = docterRepository.save(Docter.builder().name("Dr'Phone").build());

        Comment com1, com2, com3;
        com1 = commentRepository.save(Comment.builder().comment("Need to check more.").build());
        com2 = commentRepository.save(Comment.builder().comment("Very Healthy.").build());
        com3 = commentRepository.save(Comment.builder().comment("Too weak for playing sports.").build());

        Patient tempPatient;
        tempPatient = patientRepository.save(Patient.builder()

                .name("Jevan")
                .surname("Wilson")
                .homeTown("907 Pennington Lane Ankeny, IA 50023")
                .age("29")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Janssen")
                .commentTest("comment-1")
                .build());

        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com1);
        com1.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Evelyn")
                .surname("Horne")
                .homeTown("8657 Prairie Drive Reynoldsburg, OH 43068")
                .age("52")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-2")
                .build());

        tempPatient.setDocter(doc2);
        tempPatient.getComment().add(com2);
        com2.setPatients(tempPatient);
        doc2.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Tara")
                .surname("Hastings")
                .homeTown("9728 North Ridgewood Drive Randallstown, MD 21133")
                .age("16")
                .vaccinateStatus("Second dose")
                .firstDose("Moderna")
                .secondDose("Sinopharm")
                .commentTest("comment-3")
                .build());

        tempPatient.setDocter(doc3);
        tempPatient.getComment().add(com3);
        com3.setPatients(tempPatient);
        doc3.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Will")
                .surname("Dickens")
                .homeTown("7826 Prince Rd. Newark, NJ 07103")
                .age("37")
                .vaccinateStatus("Second dose")
                .firstDose("Oxford")
                .secondDose("Janssen")
                .commentTest("comment-4")
                .build());

        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com1);
        com1.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Daniel")
                .surname("Lees")
                .homeTown("231 Bedford Street Canal Winchester, OH 43110")
                .age("21")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .commentTest("comment-5")
                .build());

        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com3);
        com3.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Farzana")
                .surname("Rennie")
                .homeTown("7578 NW. Green Street Taunton, MA 02780")
                .age("65")
                .vaccinateStatus("Second dose")
                .firstDose("Sputnik V")
                .secondDose("Janssen")
                .commentTest("comment-6")
                .build());

        tempPatient.setDocter(doc2);
        tempPatient.getComment().add(com2);
        com2.setPatients(tempPatient);
        doc2.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Ishaaq")
                .surname("Brook")
                .homeTown("494 Wintergreen St. Berwyn, IL 60402")
                .age("17")
                .vaccinateStatus("First dose")
                .firstDose("Sinopharm")
                .secondDose("-")
                .commentTest("comment-7")
                .build());

        tempPatient.setDocter(doc3);
        tempPatient.getComment().add(com1);
        com1.setPatients(tempPatient);
        doc3.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Mia-Rose")
                .surname("Zamora")
                .homeTown("8400 Inverness Avenue Boca Raton, FL 33428")
                .age("12")
                .vaccinateStatus("First dose")
                .firstDose("Pfizer")
                .secondDose("-")
                .commentTest("comment-8")
                .build());

        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com1);
        com1.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Yvette")
                .surname("Hendricks")
                .homeTown("3 Smith Drive Kingsport, TN 37660")
                .age("42")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Oxford")
                .commentTest("comment-9")
                .build());

        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com2);
        com2.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()

                .name("Aleeza")
                .surname("Alford")
                .homeTown("723 North Carson Dr. Owensboro, KY 42301")
                .age("26")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Pfizer")
                .commentTest("comment-10")
                .build());
        tempPatient.setDocter(doc1);
        tempPatient.getComment().add(com1);
        com1.setPatients(tempPatient);
        doc1.getOwnEvents().add(tempPatient);
        addUser();
        doc1.setUser(user1);
        user1.setDoctor(doc1);
        doc2.setUser(user2);
        user2.setDoctor(doc2);
        doc3.setUser(user3);
        user3.setDoctor(doc3);

    }
    User user1, user2, user3;

    private void addUser(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Authority authUser =
                Authority.builder().name(AuthorityName.ROLE_USER).build();
        Authority authAdmin =
                Authority.builder().name(AuthorityName.ROLE_ADMIN).build();
        Authority.builder().name(AuthorityName.ROLE_ADMIN).build();
        user1 = User.builder()
                .username("admin")
                .password(encoder.encode("admin"))
                .firstname("admin")
                .lastname("admin")
                .email("admin@gmail.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();

        user2 = User.builder()
                .username("doctor")
                .password(encoder.encode("doctor"))
                .firstname("Trainee")
                .lastname("Doctor")
                .email("enabled@user.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();

        user3 = User.builder()
                .username("patient")
                .password(encoder.encode("patient"))
                .firstname("I'm sick")
                .lastname("need help")
                .email("Needhelp@user.com")
                .enabled(false)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();

        authorityRepository.save(authUser);
        authorityRepository.save(authAdmin);
        user1.getAuthorities().add(authUser);
        user1.getAuthorities().add(authAdmin);
        user2.getAuthorities().add(authUser);
        user3.getAuthorities().add(authUser);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }
}