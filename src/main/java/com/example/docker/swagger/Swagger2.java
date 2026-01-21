package com.example.docker.swagger;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Auth Application build by Durgesh Tiwari.",
                description = "Generic auth app that can be used with any application.",
                contact = @Contact(
                        name = "Durgesh Kumar Tiwari",
                        url = "https://www.substringtechnologies.com/",
                        email = "support@substringtechnologies.com"
                ),
                version = "1.0",
                summary = "This app is very useful if you dont want create auth app from scratch."
        )
        ,
        security = {
                @SecurityRequirement(
                        name="bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer", //Authorization: Bearer htokenaswga,
        bearerFormat = "JWT"

)
public class Swagger2 {

}
