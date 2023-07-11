package com.project.losobeatz.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    private Long id;
    private String userEmail;
    private String userPassword;
    private String userRepeatPassword;
    private String userName;
}
