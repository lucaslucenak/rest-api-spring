package br.com.lucaslucena.restcalculatorspring.controllers;

import br.com.lucaslucena.restcalculatorspring.util.math.MathOperations;
import br.com.lucaslucena.restcalculatorspring.util.math.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    NumberUtil numberUtil;
    @Autowired
    MathOperations mathOperations;

    @GetMapping("/addition/{n1}/{n2}")
    public Double sumTwoNumbers (@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return mathOperations.sumTwoNumbers(n1, n2);
    }

    @GetMapping("/subtraction/{n1}/{n2}")
    public Double subtractTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {

        return mathOperations.subtractTwoNumbers(n1, n2);
    }

    @GetMapping("/multiplication/{n1}/{n2}")
    public Double multiplicateTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return mathOperations.multiplicateTwoNumbers(n1, n2);
    }

    @GetMapping("/division/{n1}/{n2}")
    public Double divideTwoNumbers(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return mathOperations.divideTwoNumbers(n1, n2);
    }

    @GetMapping("/square/{n1}")
    public Double square(@PathVariable("n1") String n1) {
        return mathOperations.square(n1);
    }

    @GetMapping("/power/{n1}/{n2}")
    public Double power(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return mathOperations.power(n1, n2);
    }
}
