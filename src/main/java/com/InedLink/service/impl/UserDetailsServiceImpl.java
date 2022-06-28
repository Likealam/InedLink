package com.InedLink.service.impl;

import com.InedLink.dto.CredentialsDto;
import com.InedLink.dto.UserDetailsImpl;
import com.InedLink.repository.CredentialsRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final CredentialsRepository credentialsRepository;

    public UserDetailsServiceImpl(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CredentialsDto credentials = credentialsRepository.getCredentialsDtoByUsername(username);
        if(credentials==null){
            throw new UsernameNotFoundException("Username " + username + " not found.");
        }
        return new UserDetailsImpl(credentials);
    }
}
