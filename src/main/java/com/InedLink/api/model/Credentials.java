package com.InedLink.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credentials {
    private String username;
    private String password;
}