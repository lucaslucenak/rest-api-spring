//package br.com.lucaslucena.restcalculatorspring.unitTests.mappers;
//
//import br.com.lucaslucena.restcalculatorspring.data.vo.v1.PersonModelVO;
//import br.com.lucaslucena.restcalculatorspring.mappers.DozerMapper;
//import br.com.lucaslucena.restcalculatorspring.models.PersonModel;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DozerMapperTest {
//
//    MockPerson inputObject;
//
//    @BeforeEach
//    public void setUp() {
//        inputObject = new MockPerson();
//    }
//
//    @Test
//    public void parseEntityToVOTest() {
//        PersonModelVO output = DozerMapper.parseObject(inputObject.mockEntity(), PersonModelVO.class);
//        assertEquals(Long.valueOf(0L), output.getId());
//        assertEquals("First Name Test0", output.getFirstName());
//        assertEquals("Last Name Test0", output.getLastName());
//        assertEquals("Addres Test0", output.getAddress());
//        assertEquals("Male", output.getGender());
//    }
//
//    @Test
//    public void parseEntityListToVOListTest() {
//        List<PersonModelVO> outputList = DozerMapper.parseObjectsList(inputObject.mockEntityList(), PersonModelVO.class);
//        PersonModelVO outputZero = outputList.get(0);
//
//        assertEquals(Long.valueOf(0L), outputZero.getId());
//        assertEquals("First Name Test0", outputZero.getFirstName());
//        assertEquals("Last Name Test0", outputZero.getLastName());
//        assertEquals("Addres Test0", outputZero.getAddress());
//        assertEquals("Male", outputZero.getGender());
//
//        PersonModelVO outputSeven = outputList.get(7);
//
//        assertEquals(Long.valueOf(7L), outputSeven.getId());
//        assertEquals("First Name Test7", outputSeven.getFirstName());
//        assertEquals("Last Name Test7", outputSeven.getLastName());
//        assertEquals("Addres Test7", outputSeven.getAddress());
//        assertEquals("Female", outputSeven.getGender());
//
//        PersonModelVO outputTwelve = outputList.get(12);
//
//        assertEquals(Long.valueOf(12L), outputTwelve.getId());
//        assertEquals("First Name Test12", outputTwelve.getFirstName());
//        assertEquals("Last Name Test12", outputTwelve.getLastName());
//        assertEquals("Addres Test12", outputTwelve.getAddress());
//        assertEquals("Male", outputTwelve.getGender());
//    }
//
//    @Test
//    public void parseVOToEntityTest() {
//        PersonModel output = DozerMapper.parseObject(inputObject.mockVO(), PersonModel.class);
//        assertEquals(Long.valueOf(0L), output.getId());
//        assertEquals("First Name Test0", output.getFirstName());
//        assertEquals("Last Name Test0", output.getLastName());
//        assertEquals("Addres Test0", output.getAddress());
//        assertEquals("Male", output.getGender());
//    }
//
//    @Test
//    public void parserVOListToEntityListTest() {
//        List<PersonModel> outputList = DozerMapper.parseObjectsList(inputObject.mockVOList(), PersonModel.class);
//        PersonModel outputZero = outputList.get(0);
//
//        assertEquals(Long.valueOf(0L), outputZero.getId());
//        assertEquals("First Name Test0", outputZero.getFirstName());
//        assertEquals("Last Name Test0", outputZero.getLastName());
//        assertEquals("Addres Test0", outputZero.getAddress());
//        assertEquals("Male", outputZero.getGender());
//
//        PersonModel outputSeven = outputList.get(7);
//
//        assertEquals(Long.valueOf(7L), outputSeven.getId());
//        assertEquals("First Name Test7", outputSeven.getFirstName());
//        assertEquals("Last Name Test7", outputSeven.getLastName());
//        assertEquals("Addres Test7", outputSeven.getAddress());
//        assertEquals("Female", outputSeven.getGender());
//
//        PersonModel outputTwelve = outputList.get(12);
//
//        assertEquals(Long.valueOf(12L), outputTwelve.getId());
//        assertEquals("First Name Test12", outputTwelve.getFirstName());
//        assertEquals("Last Name Test12", outputTwelve.getLastName());
//        assertEquals("Addres Test12", outputTwelve.getAddress());
//        assertEquals("Male", outputTwelve.getGender());
//    }
//}
