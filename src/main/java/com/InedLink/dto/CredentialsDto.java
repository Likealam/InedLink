package com.InedLink.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class CredentialsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
}
