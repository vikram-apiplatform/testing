package io.vikram.repository;

import io.vikram.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test,String> {
}
