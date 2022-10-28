package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.rest.service.DocterService;
import se331.rest.util.LabMapper2;

@RestController
public class DocterController {
    @Autowired
    DocterService docterService;
    @GetMapping("/docters")
    ResponseEntity<?> getDocters(){
        return ResponseEntity.ok(LabMapper2.INSTANCE.getDocterDTO(docterService.getAllDocter()));
    }
}
