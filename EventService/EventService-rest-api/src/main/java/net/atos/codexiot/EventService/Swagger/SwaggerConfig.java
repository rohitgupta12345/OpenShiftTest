package net.atos.codexiot.EventService.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages ={"net.atos.codexiot.EventService.controller"})
public class SwaggerConfig {
	/**
     * @return Docket
     */
	
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("SpringBootArchetype")
	        .select()                                  
	        .apis(RequestHandlerSelectors.basePackage("net.atos.codexiot.EventService.controller"))              
	        .paths(PathSelectors.any())                          
	        .build()
	        .apiInfo(apiInfo());
    }/*configuring the API & API Endpoint url */
    /**
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        		.title("SPRING BOOT ARCHETYPE")
    	        .description("SPRING BOOT ARCHETYPE DETAILS")
    	        .version("2.0")
    	        .build();
    }/*configuring the API info of swagger */

}
