package com.crops.controller;

import com.crops.model.Crops;
import com.crops.service.CropsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/crops")
public class CropsController {

    @Autowired
    CropsService service;

    @GetMapping("/all")
    public List<Crops> getAllCrops(){
        return service.getAllCrops();
    }
    @GetMapping("/{id}")
    public Optional<Crops> getCrop(@PathVariable int cropid){
        return service.getCrop(cropid);
    }
    @PostMapping("/save")
    public Crops addCrop(@RequestBody Crops crop){
        return service.addCrop(crop);
    }
    @PutMapping("/update")
    public Crops putCrop(@RequestBody Crops crop){
        return service.updateCrop(crop);
    }
    @DeleteMapping("/delete")
    public Optional<Crops> deleteCrop(@PathVariable int id){
        return service.deleteCrop(id);
    }
}
