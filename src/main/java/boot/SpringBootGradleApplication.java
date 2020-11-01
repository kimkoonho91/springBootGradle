package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringBootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleApplication.class, args);
	}
	
	// 리졸버 설정
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    
	    return resolver;
	}
}
