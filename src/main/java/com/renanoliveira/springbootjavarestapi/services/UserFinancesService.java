package com.renanoliveira.springbootjavarestapi.services;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.repository.UserFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserFinancesService {

    @Autowired
    private UserFinanceRepository userFinanceRepository;

    public List<UserFinance> findAll(){

        return userFinanceRepository.findAll();
    }

    public UserFinance findById(String id){
        Optional<UserFinance> userFinance = userFinanceRepository.findById(id);
        return userFinance.orElseThrow(() -> new ObjectNotFoundException("User finance not found"));
    }

}
