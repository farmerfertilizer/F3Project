package com.crops.service;

import com.crops.model.Crops;
import com.crops.repository.CropsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CropsService {
    @Autowired
    CropsRepository repository;
    public List<Crops> getAllCrops() {
        return repository.findAll();
    }

    public Optional<Crops> getCrop(int cropid) {
        return repository.findById(cropid);
    }

    public Crops addCrop(Crops crop) {
        return repository.save(crop);
    }

    public Crops updateCrop(Crops crop) {
        return repository.save(crop);
    }

    public Optional<Crops> deleteCrop(int id) {
        Optional<Crops> crop = this.getCrop(id);
        repository.deleteById(id);
        return crop;
    }
}
