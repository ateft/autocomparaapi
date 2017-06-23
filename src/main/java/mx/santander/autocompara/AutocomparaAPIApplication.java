package mx.santander.autocompara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Atef on 04/05/2017.
 */

@EnableEurekaClient
@SpringBootApplication
public class AutocomparaAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutocomparaAPIApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
