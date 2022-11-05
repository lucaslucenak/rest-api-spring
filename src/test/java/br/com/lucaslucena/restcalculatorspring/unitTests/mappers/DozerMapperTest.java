package br.com.lucaslucena.restcalculatorspring.unitTests.mappers;

import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
import br.com.lucaslucena.restcalculatorspring.data.vo.v2.PersonModelVO2;
import br.com.lucaslucena.restcalculatorspring.mappers.DozerMapper;
import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    public void shouldMapPersonVOListIntoPersonModelList() {
        PersonModelVO personModelVO_1 = new PersonModelVO(1L, "Lucas", "Lucena", "Iremar", "M");
        PersonModelVO personModelVO_2 = new PersonModelVO(2L, "Maria", "Lucena", "Marinho", "F");
        List<PersonModelVO> personModelVOs = new ArrayList<>(List.of(personModelVO_1, personModelVO_2));
        PersonModel personModel_1 = new PersonModel(1L, "Lucas", "Lucena", "Iremar", "M", new Date());
        PersonModel personModel_2 = new PersonModel(2L, "Maria", "Lucena", "Marinho", "F", new Date());
        List<PersonModel> personModels = new ArrayList<>(List.of(personModel_1, personModel_2));

        Mockito.when(mapper.parseListOfObjects(personModelVOs, PersonModel.class)).thenReturn(personModels);
        Assertions.assertEquals(mapper.parseListOfObjects(personModelVOs, PersonModel.class), personModels);
    }

    @Test
    public void shouldMapPersonVO2ListIntoPersonModelList() {
        PersonModelVO2 personModelVO2_1 = new PersonModelVO2(1L, "Lucas", "Lucena", "Iremar", "M", new Date());
        PersonModelVO2 personModelVO2_2 = new PersonModelVO2(2L, "Maria", "Lucena", "Marinho", "F", new Date());
        List<PersonModelVO2> personModelVO2s = new ArrayList<>(List.of(personModelVO2_1, personModelVO2_2));
        PersonModel personModel_1 = new PersonModel(1L, "Lucas", "Lucena", "Iremar", "M", new Date());
        PersonModel personModel_2 = new PersonModel(2L, "Maria", "Lucena", "Marinho", "F", new Date());
        List<PersonModel> personModels = new ArrayList<>(List.of(personModel_1, personModel_2));

        Mockito.when(mapper.parseListOfObjects(personModelVO2s, PersonModel.class)).thenReturn(personModels);
        Assertions.assertEquals(mapper.parseListOfObjects(personModelVO2s, PersonModel.class), personModels);
    }

    @Test
    public void shouldMapPersonVO2IntoPersonModel() {
        PersonModelVO2 personModelVO2 = new PersonModelVO2(1L, "Lucas", "Lucena", "IREMAR", "M", new Date());
        PersonModel personModel = new PersonModel(1L, "Lucas", "Lucena", "IREMAR", "M", new Date());
        Mockito.when(mapper.parseObject(personModelVO2, PersonModel.class)).thenReturn(personModel);

        Assertions.assertEquals(mapper.parseObject(personModelVO2, PersonModel.class), personModel);
    }
}
