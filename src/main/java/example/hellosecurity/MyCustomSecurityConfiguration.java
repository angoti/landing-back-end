package example.hellosecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@EnableWebSecurity
public class MyCustomSecurityConfiguration extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) {
        try {
            http
                    .cors().and()
                    .authorizeHttpRequests(authorize -> authorize
                            .mvcMatchers("/aberto/**").permitAll()
                            .anyRequest().authenticated())
                    .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}