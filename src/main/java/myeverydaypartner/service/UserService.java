package myeverydaypartner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import myeverydaypartner.models.UserEntity;
import myeverydaypartner.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity = repo.findByEmail(email);
		
		if(userEntity != null) {
			var springUser = User.withUsername(userEntity.getEmail())
					.password(userEntity.getPassword())
					.roles(userEntity.getRole())
					.build();
			
			return springUser;
		}
		return null;
	}
    
}
