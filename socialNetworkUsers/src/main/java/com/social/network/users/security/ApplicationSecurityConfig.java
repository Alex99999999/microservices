package com.social.network.users.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
//public class ApplicationSecurityConfig extends WebSecurityConfiguration {

    // circular dependency error
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/users/**").permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic();
//        return http.build();
//    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/users/**").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated();
        http.cors().and().csrf().disable();
    }

}
