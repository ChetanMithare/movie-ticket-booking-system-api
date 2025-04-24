package com.example.mtb.repository;

import com.example.mtb.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    boolean existsByEmail(String email);
    UserDetails findByEmail(String email);
}
