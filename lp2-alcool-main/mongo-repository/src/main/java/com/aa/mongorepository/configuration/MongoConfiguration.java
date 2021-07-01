package com.aa.mongorepository.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfiguration {

    @Value("${url.mongo}")
    private String url_mongo;

    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create(url_mongo);
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(),"alcool");
    }
}
