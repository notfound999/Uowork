package com.example.upwork.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="user_id" , unique = true , nullable = false , updatable = false )
    private UUID id;

    @Column(name = "user_username",nullable = false,unique = true)
    private String username;

    @Column(name = "user_email" ,nullable = false,unique = true)
    private String email;

    @Column(name = "user_password",nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role",nullable = false)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Proposal> proposals;

    @OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY)
    private List<Project> createdProjects;

    @OneToMany(mappedBy = "assignedTo", fetch = FetchType.LAZY)
    private List<Project> assignedProjects;

}
