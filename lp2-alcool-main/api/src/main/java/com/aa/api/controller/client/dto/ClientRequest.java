package com.aa.api.controller.client.dto;

import com.aa.core.domain.Client;
import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
public class ClientRequest {
    private String name;
    private String email;
    private String password;
    private String birthDay;
    private String cpf;

    public Client toClient(){
        var dateFormat = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return Client.builder()
                .name(name)
                .email(email)
                .password(password)
                .birthDay(dateFormat)
                .cpf(cpf)
                .build();
    }
}
