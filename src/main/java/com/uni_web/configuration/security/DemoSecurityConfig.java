package com.uni_web.configuration.security;


import com.uni_web.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


@Configuration
public class DemoSecurityConfig {

    //bcrypt bean definition
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //authenticationProvider bean definition
    @Bean
    public DaoAuthenticationProvider authenticationProvider(UserService userService) {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService); //set the custom user details service
        auth.setPasswordEncoder(passwordEncoder()); //set the password encoder - bcrypt
        return auth;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           AuthenticationSuccessHandler customAuthenticationSuccessHandler) throws Exception {

        http.authorizeRequests(authorizeRequests ->
                                       authorizeRequests
                                               .requestMatchers("/employees/**").hasRole("EMPLOYEE")
                                               .requestMatchers("/leaders/**").hasRole("MANAGER")
                                               .requestMatchers("/systems/**").hasRole("ADMIN")
                                               .requestMatchers("/",
                                                                "/testing",
                                                                "/css/style.css",
                                                                "/css/style1.css",
                                                                "/js/input.js",
                                                                "/js/main.js",
                                                                "/img/**",
                                                                "/images/**",
                                                                "/course-grade/**",
                                                                "/courses/**",
                                                                "/register/**",
                                                                "/contact/**"
                                               ).permitAll()
                                               .anyRequest().authenticated()

                )
                .formLogin(form ->
                                   form
                                           .loginPage("/showMyLoginPage")
                                           .loginProcessingUrl("/authenticateTheUser")
                                           .successHandler(customAuthenticationSuccessHandler)
                                           .permitAll()
                )
                .logout(logout -> logout
                        .permitAll()
                        .logoutSuccessUrl("/")
                )
                .exceptionHandling(configurer ->
                                           configurer.accessDeniedPage("/access-denied")


                );

        return http.build();
    }


}