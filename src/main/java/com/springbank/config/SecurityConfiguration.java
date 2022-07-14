package com.springbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebListener;


@Configuration
public class SecurityConfiguration {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((auth) -> auth
                .antMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                .antMatchers("/notices", "/contact").permitAll()
        ).httpBasic(Customizer.withDefaults());
        return http.build();


    }
}