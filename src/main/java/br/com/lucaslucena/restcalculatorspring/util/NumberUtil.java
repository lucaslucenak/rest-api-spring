package br.com.lucaslucena.restcalculatorspring.util;

import br.com.lucaslucena.restcalculatorspring.exceptions.NotNumericNumberException;
import br.com.lucaslucena.restcalculatorspring.util.validation.NumberValidation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NumberUtil {
    NumberValidation numberValidation = new NumberValidation();

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
