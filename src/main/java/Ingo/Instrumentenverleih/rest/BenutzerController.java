package Ingo.Instrumentenverleih.rest;

import Ingo.Instrumentenverleih.model.Benutzer;
import Ingo.Instrumentenverleih.model.BenutzerRequestObject;
import Ingo.Instrumentenverleih.repositories.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin(origins ={"http://localhost/"})
@RequestMapping("/benutzer")

public class BenutzerController {

    @Autowired
    private BenutzerRepository repo;

    @GetMapping("")
    public ResponseEntity<Object> getBenutzer(){
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<Object> addBenutzer(@RequestBody BenutzerRequestObject bro){
        Benutzer neuerBenutzer = new Benutzer();
        neuerBenutzer.setName(bro.name);
        neuerBenutzer.setEmail(bro.email);
        neuerBenutzer.setFirstName(bro.firstName);
        neuerBenutzer.setPassword(bro.password);
        return new ResponseEntity<Object>(repo.save(neuerBenutzer), HttpStatus.CREATED);
    }


}
