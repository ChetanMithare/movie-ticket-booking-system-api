package com.example.mtb.service;

import com.example.mtb.dto.UserRegistrationRequest;
import com.example.mtb.dto.UserResponse;
import com.example.mtb.dto.UserUpdationRequest;
import com.example.mtb.entity.UserDetails;
import org.springframework.http.ResponseEntity;

public interface UserService {

    UserResponse addUser(UserRegistrationRequest user);

    UserResponse editUser(UserUpdationRequest user, String email);

    UserResponse softDeleteUser(String email);
}
