package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfiguration {

//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//                .paths(PathSelectors.regex("/.*"))
//                .build()
//                .apiInfo(apiEndPointsInfo());
//
//    }
//    private ApiInfo apiEndPointsInfo() {
//        return new ApiInfoBuilder().title("Spring Boot REST API")
//                .description("Employee Management REST API")
//                .contact(new Contact("loda", "https://loda.me/", "loda.namnh@gmail.com"))
//                .license("Apache 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .version("1.0.0")
//                .build();
//    }
}
