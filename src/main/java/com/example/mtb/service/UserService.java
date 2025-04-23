package com.example.mtb.service;

import com.example.mtb.entity.UserDetails;
import org.springframework.http.ResponseEntity;

public interface UserService {

    UserDetails addUser(UserDetails user);
}
