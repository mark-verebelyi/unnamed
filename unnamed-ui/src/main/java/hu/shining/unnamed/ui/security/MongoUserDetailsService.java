package hu.shining.unnamed.ui.security;

import hu.shining.unnamed.core.security.model.User;
import hu.shining.unnamed.core.security.repository.UserRepository;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MongoUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	public MongoUserDetailsService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		final User user = this.userRepository.findByUsername(username);
		return fromUser(user);
	}

	private static UserDetails fromUser(final User user) {
		final Collection<? extends GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true, true, true, true,
				authorities);
	}

}
