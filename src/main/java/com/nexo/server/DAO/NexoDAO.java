package com.nexo.server.DAO;

import com.nexo.server.Entity.TighteningProcess;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NexoDAO extends MongoRepository<TighteningProcess, String> {

    TighteningProcess findByIdCode(String idCode);
}
