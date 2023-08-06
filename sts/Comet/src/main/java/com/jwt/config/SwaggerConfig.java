package com.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig
{

	// 
	@Bean
	public Docket postApi()
	{

		return new Docket(DocumentationType.SWAGGER_2)
						.groupName("Comet")
						.apiInfo(apiInfo())
						.select()
						.paths(regex("/emp.*"))
						.build();
	}
	
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("Employee CRUD")
									.description("Demo documentation generated using the SwaggerAPI for the REST API")
									.termsOfServiceUrl("Samle")
									.license("MIT")
									.licenseUrl("MIT.lab")
									.version("2.0")
									.build();
									
	}
}
