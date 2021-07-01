package com.aa.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class Client {
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthDay;
    private String cpf;
}