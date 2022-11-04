package br.com.lucaslucena.restcalculatorspring.controllers.v2;

import br.com.lucaslucena.restcalculatorspring.data.vo.v2.PersonModelVO2;
import br.com.lucaslucena.restcalculatorspring.services.v2.PersonServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/person")
public class PersonControllerV2 {

    @Autowired
    PersonServiceV2 personService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModelVO2 findPerson(@PathVariable("id") Long id) {
        return personService.findPersonById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonModelVO2> findAllPersons() {
        return personService.findAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable("id") Long id) {
        personService.deletePersonById(id);
    }

    @PostMapping
    public PersonModelVO2 createPerson(@RequestBody PersonModelVO2 personModel) {
        return personService.savePerson(personModel);
    }

    @PutMapping("{id}")
    public PersonModelVO2 updatePerson(@RequestBody PersonModelVO2 personModel, @PathVariable("id") Long id) {
        return personService.updatePersonById(personModel);
    }
}