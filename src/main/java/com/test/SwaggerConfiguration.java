package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test"))
                //.paths(PathSelectors.ant("/home/**")
                                //.or(PathSelectors.ant("/api/**")))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private static ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Swagger Example")
                .description("A Spring boot demo application for swagger")
                .version("1.0.5")
                //.termsOfServiceUrl("")
                .contact(new Contact("Jyoti Kumar","https://github.com/jy-kumar","n/a"))
                //.license("")
                //.licenseUrl("")
                .build();

    }

}