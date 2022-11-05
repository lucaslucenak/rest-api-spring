package br.com.lucaslucena.restcalculatorspring.unitTests.mappers;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import br.com.lucaslucena.restcalculatorspring.mappers.DozerMapper;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.text.DateFormat;
import java.util.Date;

public class DozerMapperTest {

    @Mock
    DozerMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = Mockito.mock(DozerMapper.class);
    }

    @Test
    public void shouldMapPersonVOIntoPersonModel() {
        PersonModelVO personModelVO = new PersonModelVO(1L, "Lucas", "Lucena", "IREMAR", "M");
        PersonModel personModel = new PersonModel(1L, "Lucas", "Lucena", "IREMAR", "M", new Date());
        Mockito.when(mapper.parseObject(personModelVO, PersonModel.class)).thenReturn(personModel);

        Assertions.assertEquals(mapper.parseObject(personModelVO, PersonModel.class), personModel);
    }
}
