package com.example.upwork.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "p_id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "p_name", nullable = false)
    private String name;

    @Column(name = "p_description", length = 2000, nullable = false)
    private String description;

    @Column(name = "p_dueDate")
    private LocalDate dueDate;

    @Column(name = "p_createDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "p_updatedDate", nullable = false)
    private LocalDate updatedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "p_status",nullable = false)
    private ProjectStatus projectStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdBy", nullable = false)
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignedTo")
    private User assignedTo;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proposal> proposals;


}
