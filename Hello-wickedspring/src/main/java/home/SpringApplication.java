package home;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringApplication.class)
                .run(args);
    }
}
