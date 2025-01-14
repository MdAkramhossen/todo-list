//package com.logrex.config;
//
//import jakarta.servlet.http.HttpFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
//
//@Configuration
//@EnableMethodSecurity
//public class SpringSecurityFilter {
//
//    @Autowired
//   private UserDetailsService userDetailsService;
//
//    @Bean
//    public static PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }
//
//          @Bean
//          SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//
//             http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize)->{
//                          authorize.requestMatchers("/api/auth/**").permitAll();
//                         authorize.anyRequest().authenticated();})
//                     .httpBasic(Customizer.withDefaults());
//
//              return http.build();
//          }
//
//
//}
