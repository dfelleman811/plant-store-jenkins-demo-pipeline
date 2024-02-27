package com.reavture.controllers;

import com.reavture.models.Plant;
import com.reavture.repository.PlantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController // @RestController -> combines @Controller along with @ResponseBody on every endpoint
@RequestMapping("/plants")
public class PlantController {

    private PlantRepository plantRepository;

    public PlantController(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @GetMapping
    public ResponseEntity<List<Plant>> getAll() {
       List<Plant> plants = plantRepository.findAll();
       return ResponseEntity.ok(plants);
    }
}
