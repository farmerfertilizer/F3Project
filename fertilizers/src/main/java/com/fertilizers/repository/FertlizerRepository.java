package com.fertilizers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fertilizers.entity.Fertilizer;

@Repository
public interface FertlizerRepository extends JpaRepository<Fertilizer, Integer> {

	Fertilizer findByFertilizerName(String fertilizerName);

}
