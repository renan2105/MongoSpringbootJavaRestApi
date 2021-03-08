package com.renanoliveira.springbootjavarestapi.repository;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFinanceRepository extends MongoRepository<UserFinance, String> {

    UserFinance findByDocumentContaining(String document);

}
