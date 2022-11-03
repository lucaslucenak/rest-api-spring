package br.com.lucaslucena.restcalculatorspring.controllers;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import br.com.lucaslucena.restcalculatorspring.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModelVO findPerson(@PathVariable("id") Long id) {
        return personService.findPersonById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonModelVO> findAllPersons() {
        return personService.findAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable("id") Long id) {
        personService.deletePersonById(id);
    }

    @PostMapping
    public PersonModelVO createPerson(@RequestBody PersonModelVO personModel) {
        return personService.savePerson(personModel);
    }

    @PutMapping
    public PersonModelVO updatePerson(@RequestBody PersonModelVO personModel) {
        return personService.updatePersonById(personModel);
    }
}
