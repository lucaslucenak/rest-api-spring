package br.com.lucaslucena.restcalculatorspring.services;

import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong atomicLong = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public PersonModel findById(String id) {
        return new PersonModel(1L, "Lucas", "Lucena", "R iremar", "M");
    }

    public List<PersonModel> findAll() {
        return new ArrayList<>(List.of(new PersonModel(1L, "Lucas", "Lucena", "R iremar", "M"),
        new PersonModel(2L, "Lucas", "Lucena", "R iremar", "M")));
    }
}
