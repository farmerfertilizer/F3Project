package com.crops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.crops.model.Crops;
@Repository
public interface CropsRepository extends JpaRepository<Crops, Integer>{

}
