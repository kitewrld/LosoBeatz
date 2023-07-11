package com.project.losobeatz.user.service;

import com.project.losobeatz.user.dto.UserDTO;
import com.project.losobeatz.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void register(UserDTO userDTO) {
    }
}
