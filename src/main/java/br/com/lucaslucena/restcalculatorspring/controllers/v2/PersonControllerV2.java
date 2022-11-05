package br.com.lucaslucena.restcalculatorspring.controllers.v2;

import br.com.lucaslucena.restcalculatorspring.data.vo.v2.PersonModelVO2;
import br.com.lucaslucena.restcalculatorspring.services.v2.PersonServiceV2;
import br.com.lucaslucena.restcalculatorspring.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/person")
public class PersonControllerV2 {

    @Autowired
    PersonServiceV2 personService;

    @GetMapping(value = "/{id}",
            produces = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML })
    public PersonModelVO2 findPerson(@PathVariable("id") Long id) {
        return personService.findPersonById(id);
    }

    @GetMapping(
            produces = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML })
    public List<PersonModelVO2> findAllPersons() {
        return personService.findAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable("id") Long id) {
        personService.deletePersonById(id);
    }

    @PostMapping(
            consumes = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML },
            produces = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML })
    public PersonModelVO2 createPerson(@RequestBody PersonModelVO2 personModel) {
        return personService.savePerson(personModel);
    }

    @PutMapping(value = "{id}",
            consumes = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML },
            produces = { MediaType.MEDIA_TYPE_APPLICATION_JSON, MediaType.MEDIA_TYPE_APPLICATION_XML, MediaType.MEDIA_TYPE_APPLICATION_YML })
    public PersonModelVO2 updatePerson(@RequestBody PersonModelVO2 personModel, @PathVariable("id") Long id) {
        return personService.updatePersonById(personModel);
    }
}