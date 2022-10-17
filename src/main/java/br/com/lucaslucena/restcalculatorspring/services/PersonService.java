package br.com.lucaslucena.restcalculatorspring.services;

import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong atomicLong = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public PersonModel findById(String id) {
        return new PersonModel(1L, "Lucas", "Lucena", "R iremar", "M");
    }
}
