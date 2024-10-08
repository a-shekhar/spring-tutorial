package config;

import beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Polly");
        return parrot;
    }

    // Adds the string “Hello”
    // to the Spring context
    @Bean
    public String helloMessage(){
        return "Hello";
    }

    //Adds the integer 10
    //to the Spring context
    @Bean
    public int number(){
        return 10;
    }
    
}

