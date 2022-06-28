package com.InedLink.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String portfolio;
    private String username;
}
