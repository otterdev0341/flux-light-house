package com.otter.lighthouse.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Table("gender")
@Data
public class GenderEntity {
    
    @Id
    private UUID id;


    @Column("detail")
    @NotBlank(message = "Detail cannot be blank")
    @NotEmpty(message = "Detail cannot be empty")
    private String detail;

    @Column("created_at")
    private LocalDateTime createdAt;
    
    @Column("updated_at")
    private LocalDateTime updatedAt;
}
