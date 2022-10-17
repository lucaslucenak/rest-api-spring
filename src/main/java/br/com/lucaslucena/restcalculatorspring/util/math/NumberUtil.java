package br.com.lucaslucena.restcalculatorspring.util.math;

import br.com.lucaslucena.restcalculatorspring.exceptions.NotNumericNumberException;
import br.com.lucaslucena.restcalculatorspring.util.validation.NumberValidation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class NumberUtil {

    @Autowired
    NumberValidation numberValidation;

    public Double parseDouble(String number) {
        if (number == null) {
            return 0D;
        }
        String formattedNumber = number.replaceAll(",", ".");
        if (numberValidation.isNumeric((formattedNumber))) {
            return Double.parseDouble(formattedNumber);
        }
        else {
            throw new NotNumericNumberException("Please, insert a valid number.");
        }
    }
}
