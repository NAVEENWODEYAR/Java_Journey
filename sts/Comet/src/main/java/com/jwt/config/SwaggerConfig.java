package com.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
@EnableWebMvc
@Component
public class SwaggerConfig implements WebMvcConfigurer
{

	
	@Bean
	public Docket postApi()
	{

		return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.jwt.controller"))
						.paths(PathSelectors.regex("/.*"))
						.build()
						.apiInfo(apiInfoData());
	}
	
	private ApiInfo apiInfoData()
	{
		return new ApiInfoBuilder().title("Employee CRUD")
									.description("Demo documentation generated using the SwaggerAPI for the REST API")
									.termsOfServiceUrl("Sample")
									.license("MIT")
									.licenseUrl("MIT.lab")
									.version("1.0.0")
									.build();
	}
	/**								
		@Bean
		public Docket api()
		{
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.jwt.controller"))
					.paths(PathSelectors.any())
					.build();
		}
		*/
}
