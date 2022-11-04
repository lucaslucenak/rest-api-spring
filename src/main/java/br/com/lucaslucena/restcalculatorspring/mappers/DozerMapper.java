package br.com.lucaslucena.restcalculatorspring.mappers;



import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DozerMapper {

    private static final Mapper mapper = new DozerBeanMapper();

    public <S, T> T parseObject(S source, Class<T> target) {
        return mapper.map(source, target);
    }

    public <S, T> List<T> parseListOfObjects(List<S> source, Class<T> target) {
        List<T> parsedObjects = new ArrayList<>();

        for (S i : source) {
            parsedObjects.add(mapper.map(i, target));
        }
        return parsedObjects;
    }

//    public static <SOURCE, TARGET> TARGET parseObject(SOURCE source, Class<TARGET> target) {
//        return mapper.map(source, target);
//    }
//
//    public static <SOURCE, TARGET> List<TARGET> parseObjectsList(List<SOURCE> sources, Class<TARGET> target) {
//        List<TARGET> targetObjects = new ArrayList<>();
//
//        for (SOURCE i : sources) {
//            targetObjects.add(mapper.map(i, target));
//        }
//        return targetObjects;
//    }
}
