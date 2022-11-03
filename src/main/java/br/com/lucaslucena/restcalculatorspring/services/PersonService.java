package br.com.lucaslucena.restcalculatorspring.services;

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
    PersonRepository personRepository;

    public PersonModelVO savePerson(PersonModelVO personModelVO) {
        var personModel = DozerMapper.parseObject(personModelVO, PersonModel.class);
        return DozerMapper.parseObject(personRepository.save(personModel), PersonModelVO.class);
    }

    public PersonModelVO findPersonById(Long id) {
        var personModelVO = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        return DozerMapper.parseObject(personModelVO, PersonModelVO.class);
    }

    public List<PersonModelVO> findAllPersons() {
        return DozerMapper.parseObjectsList(personRepository.findAll(), PersonModelVO.class);
    }

    public PersonModelVO updatePersonById(PersonModelVO personModel) {
        var oldPerson = personRepository.findById(personModel.getId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });

        oldPerson.setAddress(personModel.getAddress());
        oldPerson.setFirstName(personModel.getFirstName());
        oldPerson.setLastName(personModel.getLastName());
        oldPerson.setGender(personModel.getGender());
        return DozerMapper.parseObject(personRepository.save(oldPerson), PersonModelVO.class);
    }

    public void deletePersonById(Long id) {
        var personModel = personRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Record not found with that ID.");
        });
        personRepository.delete(personModel);
    }

}
