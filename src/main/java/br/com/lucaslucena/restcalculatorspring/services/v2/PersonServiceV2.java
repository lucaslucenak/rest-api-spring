package br.com.lucaslucena.restcalculatorspring.services.v2;

import br.com.lucaslucena.restcalculatorspring.data.vo.v2.PersonModelVO2;
import br.com.lucaslucena.restcalculatorspring.exceptions.ResourceNotFoundException;
import br.com.lucaslucena.restcalculatorspring.mappers.DozerMapper;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import br.com.lucaslucena.restcalculatorspring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServiceV2 {

    private Logger logger = Logger.getLogger(br.com.lucaslucena.restcalculatorspring.services.v1.PersonService.class.getName());

    @Autowired
    DozerMapper mapper;

    @Autowired
    PersonRepository personRepository;

    public PersonModelVO2 savePerson(PersonModelVO2 personModelVO2) {
        var personModel = mapper.parseObject(personModelVO2, PersonModel.class);
        return mapper.parseObject(personRepository.save(personModel), PersonModelVO2.class);
    }

    public PersonModelVO2 findPersonById(Long id) {
        var personModelVO = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        return mapper.parseObject(personModelVO, PersonModelVO2.class);
    }

    public List<PersonModelVO2> findAllPersons() {
        return mapper.parseListOfObjects(personRepository.findAll(), PersonModelVO2.class);
    }

    public PersonModelVO2 updatePersonById(PersonModelVO2 personModel) {
        var oldPerson = personRepository.findById(personModel.getId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });

        oldPerson.setAddress(personModel.getAddress());
        oldPerson.setFirstName(personModel.getFirstName());
        oldPerson.setLastName(personModel.getLastName());
        oldPerson.setGender(personModel.getGender());
        return mapper.parseObject(personRepository.save(oldPerson), PersonModelVO2.class);
    }

    public void deletePersonById(Long id) {
        var personModel = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        personRepository.delete(personModel);
    }

}