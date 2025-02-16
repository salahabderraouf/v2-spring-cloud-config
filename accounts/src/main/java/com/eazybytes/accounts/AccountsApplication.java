package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/* this annotation is used to perform auto configurations
and to scan all the beans inside our spring boot application
*/
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value={AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice rest api doc",
				version = "v1",
				description = "Accounts Management System",
				contact=@Contact(name="EazyBytes",
								 email="eazybytes.com",
								 url="https://www.eazybytes.com"),
				license = @License(
						name="Apache 2.0",
						url="https://www.apache.org/licenses/LICENSE-2.0.html"
				)
		),

		externalDocs = @ExternalDocumentation(
				description = "EazyBytes Documentation",
				url = "https://www.eazybytes.com"
		)
)

public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
	}

}
