package com.aa.mongorepository;

import com.aa.core.domain.Client;
import com.aa.core.port.driven.ClientRepositoryPort;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ClientRepositoryAdapter implements ClientRepositoryPort {

    private final MongoTemplate mongoTemplate;

    @Inject
    public ClientRepositoryAdapter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Client save(Client client) {
        return mongoTemplate.save(client);
    }

    @Override
    public Client findById(String id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
