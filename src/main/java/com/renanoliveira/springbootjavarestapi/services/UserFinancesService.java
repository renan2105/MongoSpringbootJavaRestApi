package com.renanoliveira.springbootjavarestapi.services;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.repository.UserFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFinancesService {

    @Autowired
    private UserFinanceRepository userFinanceRepository;

    public List<UserFinance> findAll(){

        return userFinanceRepository.findAll();


    }

}
