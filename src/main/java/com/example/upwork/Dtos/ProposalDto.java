package com.example.upwork.Dtos;

import com.example.upwork.entity.Project;
import com.example.upwork.entity.ProposalStatus;
import com.example.upwork.entity.User;

import java.util.UUID;

public record ProposalDto(
        UUID id ,
        String proposalName,
        String proposalDescription,
        Project project,
         User user,
        ProposalStatus status
) {
}
