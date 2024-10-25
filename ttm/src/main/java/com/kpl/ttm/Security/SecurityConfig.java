package com.kpl.ttm.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity
            .formLogin(httpForm -> { 
                httpForm
                    .loginPage("/").permitAll(); // Custom login page
            })
            .authorizeHttpRequests(registry -> {
                registry.requestMatchers("/req/signup", "/login", "/css/**", "/js/**", "/img/**").permitAll(); // Allow static resources
                registry.anyRequest().authenticated(); // All other requests require authentication
            })
            .build();
    }
}
