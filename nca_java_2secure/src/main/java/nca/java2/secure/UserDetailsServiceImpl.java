package nca.java2.secure;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{
	private final AccountsRepository accountsRepository;
	public UserDetailsServiceImpl(AccountsRepository repository){
		this.accountsRepository = repository;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		AccountsEntity accounts = accountsRepository.findById(username).orElseThrow(() ->
			new UsernameNotFoundException(username));
		return User.withUsername(accounts.getUsername()).password(accounts.getPassword()).build();
	}
}
