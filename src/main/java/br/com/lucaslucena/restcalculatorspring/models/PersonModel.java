package br.com.lucaslucena.restcalculatorspring.models;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_person")
public class PersonModel  {

    public PersonModel(PersonModelVO personModelVO) {
        firstName = personModelVO.getFirstName();
        lastName = personModelVO.getLastName();
        address = personModelVO.getAddress();
        gender = personModelVO.getGender();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String gender;
}
