package br.com.lucaslucena.restcalculatorspring.services;

import br.com.lucaslucena.restcalculatorspring.exceptions.ResourceNotFoundException;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import br.com.lucaslucena.restcalculatorspring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    PersonRepository personRepository;

    public PersonModel savePerson(PersonModel personModel) {
        return personRepository.save(personModel);
    }

    public PersonModel findPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
    }

    public List<PersonModel> findAllPersons() {
        return personRepository.findAll();
    }

    public PersonModel updatePersonById(PersonModel personModel) {
        var oldPerson = personRepository.findById(personModel.getId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });

        oldPerson.setAddress(personModel.getAddress());
        oldPerson.setFirstName(personModel.getFirstName());
        oldPerson.setLastName(personModel.getLastName());
        oldPerson.setGender(personModel.getGender());
        return personRepository.save(oldPerson);
    }

    public void deletePersonById(Long id) {
        var personModel = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        personRepository.delete(personModel);
    }

}
