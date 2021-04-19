package com.api.fizzbuzzapi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Generates password at runtime securing any request. Password generated in console can be used in basic auth 
 * when sending a request to the rest api.
 * @author nishanjayetileke
 *
 */

@Configuration
//@EnableWebSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest()
            .permitAll()
            .and().csrf().disable();
    }
}