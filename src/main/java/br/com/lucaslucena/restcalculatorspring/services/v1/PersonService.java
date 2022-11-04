package br.com.lucaslucena.restcalculatorspring.services.v1;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import br.com.lucaslucena.restcalculatorspring.exceptions.ResourceNotFoundException;
import br.com.lucaslucena.restcalculatorspring.mappers.DozerMapper;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import br.com.lucaslucena.restcalculatorspring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    DozerMapper mapper;

    @Autowired
    PersonRepository personRepository;

    public PersonModelVO savePerson(PersonModelVO personModelVO) {
        var personModel = mapper.parseObject(personModelVO, PersonModel.class);
        return mapper.parseObject(personRepository.save(personModel), PersonModelVO.class);
    }

    public PersonModelVO findPersonById(Long id) {
        var personModelVO = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        return mapper.parseObject(personModelVO, PersonModelVO.class);
    }

    public List<PersonModelVO> findAllPersons() {
        return mapper.parseListOfObjects(personRepository.findAll(), PersonModelVO.class);
    }

    public PersonModelVO updatePersonById(PersonModelVO personModel) {
        var oldPerson = personRepository.findById(personModel.getId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });

        oldPerson.setAddress(personModel.getAddress());
        oldPerson.setFirstName(personModel.getFirstName());
        oldPerson.setLastName(personModel.getLastName());
        oldPerson.setGender(personModel.getGender());
        return mapper.parseObject(personRepository.save(oldPerson), PersonModelVO.class);
    }

    public void deletePersonById(Long id) {
        var personModel = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        personRepository.delete(personModel);
    }

}
