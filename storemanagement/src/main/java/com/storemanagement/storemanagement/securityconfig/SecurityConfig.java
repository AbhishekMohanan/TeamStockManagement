package com.storemanagement.storemanagement.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.storemanagement.storemanagement.serviceclass.Userservice;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	    @Autowired
	    Userservice eservice;

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(eservice);
	    }

//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http.authorizeRequests()
//	                .antMatchers("/admin").hasRole("ADMIN")
//	                .antMatchers("/customer").hasAnyRole("CUSTOMER", "ADMIN")
//	                .antMatchers("/seller").hasAnyRole("SELLER", "ADMIN")
//	                .antMatchers("/TVList").hasAnyRole("CUSTOMER", "ADMIN")
//	                .antMatchers("/").permitAll()
//	                .and().formLogin().loginPage("/login").permitAll();
//	        
//	    }
//	    
	    
	    @Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			
		            .antMatchers("/").hasAnyRole("EMPLOYEE", "ADMIN")
		            .antMatchers("/seller").hasAnyRole("SELLER", "ADMIN")
		            .antMatchers("/TVList").hasAnyRole("CUSTOMER", "ADMIN")
//		            .antMatchers("/").permitAll()
					.and().formLogin().loginPage("/login").permitAll()
					.and().logout().permitAll();
					

			http.csrf().disable();
		}

	    @Bean
	    public PasswordEncoder getPasswordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	    }
	
	
}
