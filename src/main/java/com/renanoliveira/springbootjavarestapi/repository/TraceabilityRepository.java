package com.renanoliveira.springbootjavarestapi.repository;

import com.renanoliveira.springbootjavarestapi.domain.Traceability;
import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceabilityRepository extends MongoRepository<Traceability, String> {

    Traceability findByDocumentContaining(String document);

}
