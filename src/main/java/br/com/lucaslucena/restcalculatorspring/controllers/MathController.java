package br.com.lucaslucena.restcalculatorspring.controllers;

import br.com.lucaslucena.restcalculatorspring.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    NumberUtil numberUtil = new NumberUtil();

    @GetMapping("/addition/{n1}/{n2}")
    public Double sumTwoNumbers (@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 + parsedN2;
    }

    @GetMapping("/subtraction/{n1}/{n2}")
    public Double subtractTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 - parsedN2;
    }

    @GetMapping("/multiplication/{n1}/{n2}")
    public Double multiplicateTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 * parsedN2;
    }

    @GetMapping("/division/{n1}/{n2}")
    public Double divideTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 / parsedN2;
    }

    @GetMapping("/square/{n1}")
    public Double square(@PathVariable("n1") String n1) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        return Math.sqrt(parsedN1);
    }

    @GetMapping("/power/{n1}/{n2}")
    public Double power(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return Math.pow(parsedN1, parsedN2);
    }
}
