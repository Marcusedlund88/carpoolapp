package com.example.carpoolapp.CONFIGURATION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> {
                    csrf
                            .disable();
                })
                .authorizeHttpRequests(auth ->{
                    auth
                            .anyRequest()
                            .permitAll();
                })
                .headers(headers->{
                    headers.frameOptions(frame->{
                        frame.disable();
                    });
                })
                .build();
    }

}
