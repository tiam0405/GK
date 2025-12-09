package com.gk_bk.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String username;
    private String passwordHash;
    private String displayName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}


