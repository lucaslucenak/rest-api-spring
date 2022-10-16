package br.com.lucaslucena.restcalculatorspring.controllers;

import br.com.lucaslucena.restcalculatorspring.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    NumberUtil numberUtil = new NumberUtil();

    @GetMapping("/add/{n1}/{n2}")
    public Double sumTwoNumbers (@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        Double parsedN1 = numberUtil.parseDouble(n1);
        Double parsedN2 = numberUtil.parseDouble(n2);
        return parsedN1 + parsedN2;
    }

    @GetMapping("/test")
    public String test() {
        return "oii";
    }

}
