package com.example.jwt2.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class Account {
    private long id;
    private String password;
    private String user_name;
    @ManyToMany
    private Role role;
}
