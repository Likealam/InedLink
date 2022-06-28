package com.InedLink.adapter;

import com.InedLink.api.model.Credentials;
import com.InedLink.dto.CredentialsDto;
import org.springframework.stereotype.Component;

@Component
public class CredentialsEntityToApiAdapter implements EntityToApiAdapter<CredentialsDto, Credentials>{
    @Override
    public Credentials convertToApi(CredentialsDto entity){
        return new Credentials(entity.getUsername(), entity.getPassword());
    }

    @Override
    public CredentialsDto convertToEntity(Credentials api) {
        CredentialsDto credentialsDto = new CredentialsDto();
        credentialsDto.setUsername(api.getUsername());
        credentialsDto.setPassword(api.getPassword());
        return credentialsDto;
    }
}
