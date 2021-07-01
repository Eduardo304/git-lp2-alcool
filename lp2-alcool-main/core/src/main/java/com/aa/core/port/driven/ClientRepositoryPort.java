package com.aa.core.port.driven;

import com.aa.core.domain.Client;

import java.util.List;

public interface ClientRepositoryPort {
    Client save(Client client);
    Client findById(String id);
    List<Client> findAll();
    void deleteById(String id);
}
