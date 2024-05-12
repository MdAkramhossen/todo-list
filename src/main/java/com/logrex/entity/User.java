package com.logrex.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "users")
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

   @Column(name = "name")
    private  String name;

    @Column(name = "user_name",nullable = false,unique = true)
    private  String userName;

    @Column(name = "email",nullable = false,unique = true)
    private  String email;

    @Column(name = "password",nullable = false)
    private  String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
    joinColumns=@JoinColumn(name = "user_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "roles_id",referencedColumnName = "id")
    )
    private Set<Roles> roles;







}
