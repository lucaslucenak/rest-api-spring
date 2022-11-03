package br.com.lucaslucena.restcalculatorspring.mappers;



import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DozerMapper {

    @Autowired
    private static final Mapper mapper = new DozerBeanMapper();

    public static <SOURCE, TARGET> TARGET parseObject(SOURCE source, Class<TARGET> target) {
        return mapper.map(source, target);
    }

    public static <SOURCE, TARGET> List<TARGET> parseObjectsList(List<SOURCE> sources, Class<TARGET> target) {
        List<TARGET> targetObjects = new ArrayList<>();

        for (SOURCE i : sources) {
            targetObjects.add(mapper.map(i, target));
        }
        return targetObjects;
    }
}
