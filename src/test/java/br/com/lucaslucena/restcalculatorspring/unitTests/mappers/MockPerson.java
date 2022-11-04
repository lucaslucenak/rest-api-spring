package br.com.lucaslucena.restcalculatorspring.unitTests.mappers;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;

import java.util.ArrayList;
import java.util.List;

public class MockPerson {


    public PersonModel mockEntity() {
        return mockModel(0);
    }

    public PersonModelVO mockVO() {
        return mockVO(0);
    }

    public List<PersonModel> mockEntityList() {
        List<PersonModel> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockModel(i));
        }
        return persons;
    }

    public List<PersonModelVO> mockVOList() {
        List<PersonModelVO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockVO(i));
        }
        return persons;
    }

    public PersonModel mockModel(Integer number) {
        PersonModel person = new PersonModel();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

    public PersonModelVO mockVO(Integer number) {
        PersonModelVO person = new PersonModelVO();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }
}