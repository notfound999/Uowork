package com.example.upwork.Dtos;

import com.example.upwork.entity.Role;

import java.util.UUID;

public record UserDto(
        UUID id,
        String username,
        String email,
        Role role
        ) {
}

