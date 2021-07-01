package com.aa.core.userstories;

import com.aa.core.domain.Client;
import com.aa.core.port.driven.ClientRepositoryPort;
import com.aa.core.port.driver.RegisterClientPort;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RegisterClientUS implements RegisterClientPort {

    private final ClientRepositoryPort clientRepositoryPort;

    @Inject
    public RegisterClientUS(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }


    @Override
    public Client execute(Client client) {
        return clientRepositoryPort.save(client);
    }
}
