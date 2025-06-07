package com.otter.lighthouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otter.lighthouse.model.GenderEntity;
import com.otter.lighthouse.service.GenderService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/gender")
@AllArgsConstructor
public class GenderController {
    
    private final GenderService genderService;

    @PostMapping()
    public Mono<GenderEntity> createGender(@Valid @RequestBody GenderEntity genderEntity) {
        // This method should call the service
        return genderService.createGender(genderEntity);
    }

    @GetMapping()
    public Flux<GenderEntity> findAllGenders() {
        // This method should call the service
        return genderService.findAllGenders();
    }

}
