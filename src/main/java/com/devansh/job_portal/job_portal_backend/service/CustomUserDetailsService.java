package com.devansh.job_portal.job_portal_backend.service;

import com.devansh.job_portal.job_portal_backend.Model.user;
import com.devansh.job_portal.job_portal_backend.Repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Collections;
@Service
public class CustomUserDetailsService implements UserDetailsService {


private final UserRepository userRepository;


public CustomUserDetailsService(UserRepository userRepository) {
this.userRepository = userRepository;
}


@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	user userEntity = userRepository.findByUsername(username);
	if (userEntity == null) {
		throw new UsernameNotFoundException("User not found with username: " + username);
	}
	GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
	return new org.springframework.security.core.userdetails.User(
			userEntity.getUsername(),
			userEntity.getPassword(),
			Collections.singletonList(authority)
	);
}
}
