package com.generation.blogpessoal.configuration;




import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI().info(new Info().title("Projeto blog pessoal")
				.description("Projeto Blog Pessoal - Michel Gonçalves").version("v0.0.1")
				.license(new License().name("Michel Gonçalves")
						.url("https://github.com/Michel9406"))
				.contact(new Contact().name("Michel Gonçalves")
						.url("https://www.linkedin.com/in/michelgon%C3%A7alvess/").email("michel9406@hotmail.com")))
				.externalDocs(new ExternalDocumentation().description("Github")
						.url("https://github.com/Michel9406/Blog-Pessoal"));
	}

	   @Bean
	    OpenApiCustomizer customerGlobalHeaderOpenApiCustomizer() {
	        return openApi -> {
	            openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations()
	                    .forEach(operation -> {

	                        ApiResponses apiResponses = operation.getResponses();

	                        apiResponses.addApiResponse("200", createApiResponse("Requisição realizada com sucesso"));
	                        apiResponses.addApiResponse("201", createApiResponse("Objeto persistido com sucesso"));
	                        apiResponses.addApiResponse("204", createApiResponse("Objeto excluído com sucesso"));
	                        apiResponses.addApiResponse("400", createApiResponse("Erro na requisição do cliente"));
	                        apiResponses.addApiResponse("401", createApiResponse("Acesso não autorizado"));
	                        apiResponses.addApiResponse("403", createApiResponse("Acesso proibido"));
	                        apiResponses.addApiResponse("404", createApiResponse("Não encontrado"));
	                        apiResponses.addApiResponse("500", createApiResponse("Erro interno no servidor"));
	                    }));
	        };
	    }

	    private ApiResponse createApiResponse(String description) {
	        return new ApiResponse().description(description);
	    }
	}