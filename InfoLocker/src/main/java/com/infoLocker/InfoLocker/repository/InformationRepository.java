package com.infoLocker.InfoLocker.repository;
import com.infoLocker.InfoLocker.model.Information;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InformationRepository extends MongoRepository<Information, String> {
}