package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	/*
	 * @Autowired private AuthenticationEntryPoint authEntryPoint;
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().
	 * httpBasic() .authenticationEntryPoint(authEntryPoint); }
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception {
	 * auth.inMemoryAuthentication().withUser("username").password("password").roles
	 * ("USER"); }
	 */
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf()
		.disable();  
		     http.authorizeRequests()
		     .antMatchers("/h2","/api/**")
		     .permitAll()  
		     .anyRequest()
		     .authenticated();  
		     http.httpBasic()
		     .authenticationEntryPoint(authEntryPoint); 

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("xp").password("xp").roles("USER");
	}
}
