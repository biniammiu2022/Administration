package com.onlineshopping.administration.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @Enumerated
    private Role role;


}
