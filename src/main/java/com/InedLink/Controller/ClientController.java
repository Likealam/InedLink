package com.InedLink.Controller;

import com.InedLink.api.model.Credentials;
import com.InedLink.api.model.User;
import com.InedLink.service.ClientService;
import com.InedLink.service.SignUpService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    final private ClientService clientService;
    final private SignUpService signUpService;

    public ClientController(ClientService clientService, SignUpService signUpService) {
        this.clientService = clientService;
        this.signUpService = signUpService;
    }


    @GetMapping(path = "/user/{username}")
    User getClient(@PathVariable String username){
        return clientService.getClient(username);
    }

    @PostMapping(path = "/signup")
    void signUpClient(@RequestBody Credentials credentials){
        signUpService.signUp(credentials);
    }
}
