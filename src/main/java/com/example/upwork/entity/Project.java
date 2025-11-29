package com.example.upwork.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table( name = "projects")
public class Project {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @Column(name = "p_id",nullable = false,updatable = false)
    private UUID id;

    @Column(name = "p_name",nullable = false)
    private String name;

    @Column(name = "p_description" ,length = 2000,)
    private String description;

    @Column(name = "p_dueDate")
    private Date dueDate;

    @Column(name = "p_createDate",nullable = false)
    private Date createdDate;

    @Column(name = "p_updatedDate",nullable = false)
    private  Date updatedDate;

    @JoinColumn(name = "")
    private User userOwner;

    @JoinColumn()
    private User assignedUser;
}
