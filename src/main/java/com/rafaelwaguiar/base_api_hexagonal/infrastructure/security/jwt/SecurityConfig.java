package com.rafaelwaguiar.base_api_hexagonal.infrastructure.security.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class SecurityConfig {
    /**
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilita CSRF para o console
                .headers(headers -> headers.frameOptions(frame -> frame.disable())) // Permite frames para H2
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/localhost:8080/**").permitAll() // Libera acesso ao H2
                        .anyRequest().authenticated() // Outras requisições exigem autenticação
                )
                .httpBasic(customizer -> {}); // Substitui o antigo httpBasic(), sem deprecated
        return http.build();
    }
    */

}
