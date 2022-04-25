package example.hellosecurity.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Teste aloMundoBean() {
        return new Teste("Alô mundo");
    }
}
