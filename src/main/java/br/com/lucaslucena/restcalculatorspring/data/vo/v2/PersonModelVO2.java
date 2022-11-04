package br.com.lucaslucena.restcalculatorspring.data.vo.v2;

import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModelVO2 {

    public PersonModelVO2(PersonModel personModel) {
        id = personModel.getId();
        firstName = personModel.getFirstName();
        lastName = personModel.getLastName();
        address = personModel.getAddress();
        gender = personModel.getGender();
    }

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String gender;

    private Date birthDate;
}