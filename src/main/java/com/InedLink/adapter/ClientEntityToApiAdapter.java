package com.InedLink.adapter;

import com.InedLink.api.model.User;
import com.InedLink.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class ClientEntityToApiAdapter implements EntityToApiAdapter<UserDto, User>{
    @Override
    public User convertToApi(UserDto entity){
        return new User(entity.getId(),entity.getSurname(),entity.getName(),entity.getPortfolio(),entity.getUsername());
    }

    @Override
    public UserDto convertToEntity(User api) {
        return new UserDto(api.getId(), api.getSurname(),api.getName(),api.getPortfolio(),api.getUsername());
    }
}
