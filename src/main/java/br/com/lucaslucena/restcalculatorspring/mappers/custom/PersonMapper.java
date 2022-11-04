package br.com.lucaslucena.restcalculatorspring.mappers.custom;

import br.com.lucaslucena.restcalculatorspring.data.vo.v2.PersonModelVO2;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PersonMapper {

    public PersonModelVO2 parseModelToVO2(PersonModel personModel) {
        PersonModelVO2 personModelVO2 = new PersonModelVO2();

        personModelVO2.setId(personModel.getId());
        personModelVO2.setFirstName(personModel.getFirstName());
        personModelVO2.setLastName(personModel.getLastName());
        personModelVO2.setAddress(personModel.getAddress());
        personModelVO2.setGender(personModel.getGender());
        personModelVO2.setBirthDate(new Date());

        return personModelVO2;
    }

    public PersonModel parseVO2ToModel(PersonModelVO2 personModelVO2) {
        PersonModel personModel = new PersonModel();

        personModel.setId(personModelVO2.getId());
        personModel.setFirstName(personModelVO2.getFirstName());
        personModel.setLastName(personModelVO2.getLastName());
        personModel.setAddress(personModelVO2.getAddress());
        personModel.setGender(personModelVO2.getGender());

        return personModel;
    }
}
