package br.com.lucaslucena.restcalculatorspring.data.vo.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModelVO {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String gender;
}
