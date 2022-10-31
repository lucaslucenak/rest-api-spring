package br.com.lucaslucena.restcalculatorspring.repositories;

import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
