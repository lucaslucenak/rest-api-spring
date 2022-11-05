package br.com.lucaslucena.restcalculatorspring.data.vo.v2;

import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "firstName", "lastName", "address", "birthDate", "gender"})
public class PersonModelVO2 {

    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String address;

//    @JsonIgnore
    private String gender;

    @JsonProperty("birth_date")
    private Date birthDate;
}