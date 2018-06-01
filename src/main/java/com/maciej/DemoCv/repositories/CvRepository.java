package com.maciej.DemoCv.repositories;

import com.maciej.DemoCv.entity.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Long> {



}
