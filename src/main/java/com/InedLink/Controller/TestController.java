package com.InedLink.Controller;

import com.InedLink.api.model.User;
import com.InedLink.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ClientService clientService;
    @GetMapping(path = "users")
    User getAllUsers(){
        return clientService.getClient("user");
    }
}
