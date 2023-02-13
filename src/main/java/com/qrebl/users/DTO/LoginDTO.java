package com.qrebl.users.DTO;

import lombok.Builder;
import lombok.Data;


@Data
public class LoginDTO {
    private String username;
    private String password ;
}
