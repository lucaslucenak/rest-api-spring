package br.com.lucaslucena.restcalculatorspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.print.attribute.standard.Media;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

        // Accept XML and JSON by Query Param
//        configurer.favorParameter(true)
//                .parameterName("media-type").ignoreAcceptHeader(true)
//                .useRegisteredExtensionsOnly(false)
//                .defaultContentType(MediaType.APPLICATION_JSON)
//                .mediaType("json", MediaType.APPLICATION_JSON)
//                .mediaType("sml", MediaType.APPLICATION_XML);
//        WebMvcConfigurer.super.configureContentNegotiation(configurer);

//         Accept XML and JSON by Header Param
        configurer.favorParameter(false)
                .ignoreAcceptHeader(false)
                .useRegisteredExtensionsOnly(false)
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("json", MediaType.APPLICATION_JSON)
                .mediaType("sml", MediaType.APPLICATION_XML);

        WebMvcConfigurer.super.configureContentNegotiation(configurer);
    }
}
