package br.com.lucaslucena.restcalculatorspring.util.math;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@NoArgsConstructor
@Component
public class MathOperations {

    @Autowired
    NumberUtil numberUtil;

    public Double sumTwoNumbers (String n1, String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 + parsedN2;
    }

    public Double subtractTwoNumbers(String n1, String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 - parsedN2;
    }

    public Double multiplyTwoNumbers(String n1, String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 * parsedN2;
    }

    public Double divideTwoNumbers(String n1, String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 / parsedN2;
    }

    public Double square(String n1) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        return Math.sqrt(parsedN1);
    }

    public Double power(String n1, String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return Math.pow(parsedN1, parsedN2);
    }
}
