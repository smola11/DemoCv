package com.maciej.DemoCv.repositories;

import com.maciej.DemoCv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
