package com.otter.lighthouse.repository;

import java.util.UUID;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.otter.lighthouse.model.GenderEntity;

@Repository
public interface GenderRepository extends ReactiveCrudRepository<GenderEntity, UUID> {
    // Additional query methods can be defined here if needed
    
}
