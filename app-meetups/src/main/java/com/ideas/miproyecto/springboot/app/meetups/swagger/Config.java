package com.ideas.miproyecto.springboot.app.meetups.swagger;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Config {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .apiInfo(getProjectInfo());
    }
//Este metodo se utiliza para que swagger carge la informacion de la api dentro de la documentacion 
    private ApiInfo getProjectInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "",
                "",
                "",
                "",
                new Contact("", "", ""),
                "",
                "", new ArrayList<>());
        return apiInfo;
    }
}
