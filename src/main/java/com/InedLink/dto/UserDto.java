package com.InedLink.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    private String portfolio;
    private String username;

}
