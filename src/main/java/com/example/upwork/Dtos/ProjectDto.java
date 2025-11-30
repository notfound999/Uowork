package com.example.upwork.Dtos;

import com.example.upwork.entity.ProjectStatus;
import com.example.upwork.entity.User;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.UUID;

public record ProjectDto(
        UUID id,
        String name,
        String description,
        LocalDate dueDate,
        LocalDate createdDate,
        LocalDate updatedDate,
        ProjectStatus projectStatus,
        User createdBy,
) {
}
