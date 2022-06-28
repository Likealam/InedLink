package com.InedLink.service.impl;

import com.InedLink.api.model.Credentials;
import com.InedLink.dto.CredentialsDto;
import com.InedLink.repository.CredentialsRepository;
import com.InedLink.service.SignUpService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final CredentialsRepository credentialsRepository;
    private final PasswordEncoder passwordEncoder;

    public SignUpServiceImpl(CredentialsRepository credentialsRepository, PasswordEncoder passwordEncoder) {
        this.credentialsRepository = credentialsRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void signUp(Credentials credentials) {
        if(credentialsRepository.getCredentialsDtoByUsername(credentials.getUsername())!=null){
            //throw new UserAlreadyExistsException();
        }
        CredentialsDto credentialsDto = new CredentialsDto();
        credentialsDto.setUsername(credentials.getUsername());
        credentialsDto.setPassword(passwordEncoder.encode(credentials.getPassword()));
        credentialsRepository.save(credentialsDto);
    }
}
