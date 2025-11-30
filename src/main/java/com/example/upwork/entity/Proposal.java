package com.example.upwork.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "proposals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proposal {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "proposal_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "proposal_name",nullable = false)
    private String proposalName;

    @Column(name = "proposal_description", nullable = false)
    private String proposalDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "proposal_status")
    private ProposalStatus status;

}
