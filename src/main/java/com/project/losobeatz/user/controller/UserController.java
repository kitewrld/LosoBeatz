package com.project.losobeatz.user.controller;

import com.project.losobeatz.user.dto.UserDTO;
import com.project.losobeatz.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    // 생성자 주입
    private final UserService userService;

    // 회원가입 페이지 출력 요청
       @GetMapping("/user/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/user/register")
    public String register(@ModelAttribute UserDTO userDTO) {
           log.info("userDTO = " + userDTO);
           log.info("UserController.register");
//        System.out.println("userDTO = " + userDTO);
//        System.out.println("UserController.register");
        userService.register(userDTO);
           return "index";
    }

}
