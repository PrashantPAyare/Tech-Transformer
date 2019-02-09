package com.pearsonVue.PearsonVue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class PearsonApplication extends SpringBootServletInitializer{

	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(PearsonApplication.class);
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(PearsonApplication.class, args);
		
	}
	
	protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ExtraConfig.class};
    }
}
