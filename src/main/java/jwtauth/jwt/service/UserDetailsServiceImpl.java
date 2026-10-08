package jwtauth.jwt.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import jwtauth.jwt.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private  UserRepository userRepository;
    
    public UserDetailsServiceImpl(UserRepository userRepository) {
    	this.userRepository=userRepository;
    }
    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found: " + username));
    }
}
