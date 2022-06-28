package com.InedLink.service.impl;

import com.InedLink.adapter.EntityToApiAdapter;
import com.InedLink.api.model.User;
import com.InedLink.dto.UserDto;
import com.InedLink.repository.UserRepository;
import com.InedLink.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    final private UserRepository userRepository;
    final private EntityToApiAdapter<UserDto, User> adapter;

    public ClientServiceImpl(UserRepository userRepository, EntityToApiAdapter<UserDto, User> adapter) {
        this.userRepository = userRepository;
        this.adapter = adapter;
    }
    @Override
    public User getClient(String username){
        return adapter.convertToApi(userRepository.getUserDtoByUsername(username));
    }
}
