package RestAPISpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestApiApplication.class, args);
//		StudentInterface s1 = context.getBean(StudentInterface.class);
	

	}

}
