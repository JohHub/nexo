package com.nexo.server.DAO;

import com.nexo.server.Entity.Graph;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GraphDAO extends MongoRepository<Graph, String> {

}
