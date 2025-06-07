package com.otter.lighthouse.service;

import org.springframework.stereotype.Service;

import com.otter.lighthouse.model.GenderEntity;
import com.otter.lighthouse.repository.GenderRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class GenderService {

    
    private final GenderRepository genderRepository;

    public Flux<GenderEntity> findAllGenders() {
    return genderRepository.findAll();
    }

    public Mono<GenderEntity> createGender(GenderEntity genderEntity) {
        return genderRepository.save(genderEntity);
    }
    
}
