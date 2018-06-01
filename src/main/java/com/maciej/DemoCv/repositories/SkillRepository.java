package com.maciej.DemoCv.repositories;

import com.maciej.DemoCv.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
