package br.com.lucaslucena.restcalculatorspring.util.validation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@Component
public class NumberValidation {

    public boolean isNumeric(String number) {
        if (number == null) {
            return false;
        }
        String formattedNumber = number.replaceAll(",", ".");
        return formattedNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
