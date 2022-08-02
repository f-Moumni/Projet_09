package com.mediscreen.note.config;

import com.mediscreen.note.exception.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class NoteConfig {

    @Bean
    public CustomErrorDecoder errorDecoder() {

        return new CustomErrorDecoder();
    }

    @Bean
    public Docket noteApi() {

        return new Docket(DocumentationType.SWAGGER_2).select()
                                                      .apis(RequestHandlerSelectors.basePackage("com.mediscreen.note.controller"))
                                                      .build();
    }
}
