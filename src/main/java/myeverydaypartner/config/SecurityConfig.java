package myeverydaypartner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests( auth -> auth
						.requestMatchers("/").permitAll()
						.requestMatchers("/contact").permitAll()
						.requestMatchers("/about").permitAll()
						.requestMatchers("/cities/**").permitAll()
						.requestMatchers("/cities/service_provider").permitAll()


						.requestMatchers("/register").permitAll()
						.requestMatchers("/logins").permitAll()
						.requestMatchers("/logout").permitAll()
						.requestMatchers("/css/**").permitAll()
						.requestMatchers("/js/**").permitAll()
						.requestMatchers("/lib/**").permitAll()
						.requestMatchers("/assets/**").permitAll()
						.requestMatchers("/images/**").permitAll()
						.requestMatchers("/img/**").permitAll()
						.requestMatchers("/assets/**").permitAll()
						.requestMatchers("/slider/**").permitAll()
						.requestMatchers("/kolkata_image/**").permitAll()
						.requestMatchers("/hyderabad_image/**").permitAll()
						.requestMatchers("/mumbai_image/**").permitAll()
						.requestMatchers("/patna_image/**").permitAll()
						.requestMatchers("/chennai_image/**").permitAll()
						.requestMatchers("/lucknow_image/**").permitAll()
						.requestMatchers("/dehradun_image/**").permitAll()

						.requestMatchers("/chandigarh_image/**").permitAll()
						.requestMatchers("/delhi_image/**").permitAll()

						.anyRequest().authenticated()
						)
				  .formLogin(form -> form
						  .defaultSuccessUrl("/",true)
						  )
				  .logout(config -> config.logoutSuccessUrl("/"))
				  .build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
