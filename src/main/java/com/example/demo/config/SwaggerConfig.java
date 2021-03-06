package com.example.demo.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                                .title("Wood Man APIs")
                                .description("This page lists all the rest apis for First Webinar Spring Train  Server App.")
                                .version("1.0-SNAPSHOT")
                                .build())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(
                        Predicates.
                                and(PathSelectors.regex("/.*")
                                        , Predicates
                                                .not(PathSelectors.regex("/error.*"))))
                .build();
    }

}
