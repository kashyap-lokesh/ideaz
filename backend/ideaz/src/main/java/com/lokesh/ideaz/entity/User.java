package com.lokesh.ideaz.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "user_name",nullable = false, unique = true)
    private String userName;

    @Column(name = "email",nullable = false, unique = true)
    private String email;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "bio", length = 300)
    private String bio;

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;

        if(!(o instanceof User user)) return false;
        return id != null && id.equals(user.id);
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }

}
