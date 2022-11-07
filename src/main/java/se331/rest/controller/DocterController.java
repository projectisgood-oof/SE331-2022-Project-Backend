package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se331.rest.entity.Docter;
import se331.rest.service.CommentService;
import se331.rest.service.DocterService;
import se331.rest.util.LabMapper2;

@RestController
public class DocterController {
    @Autowired
    DocterService docterService;

    @Autowired
    CommentService commentService;

    @GetMapping("/doctors")
    ResponseEntity<?> getDocters(){
        return ResponseEntity.ok(LabMapper2.INSTANCE.getDocterDTO(docterService.getAllDocter()));
    }

    @GetMapping("doctors/{id}")
    public ResponseEntity<?> getDocter(@PathVariable("id") Long id) {
        Docter output = docterService.getDocter(id);
        if(output != null){
            return ResponseEntity.ok(LabMapper2.INSTANCE.getDocterDTO(output));
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The given id is not found");
        }
    }
    @PostMapping("/addDoctor")
    public ResponseEntity<?> addDoctor(@RequestBody Docter doctor) {
        Docter output = docterService.save(doctor);
        return ResponseEntity.ok(LabMapper2.INSTANCE.getDocterDTO(output));
    }

}
