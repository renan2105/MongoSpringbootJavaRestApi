package com.renanoliveira.springbootjavarestapi.config;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.repository.UserFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserFinanceRepository userFinanceRepository;

    @Override
    public void run(String... args) throws Exception {

        userFinanceRepository.deleteAll();

        UserFinance userFinance = new UserFinance(null, "46111058819", "Renan Oliveira da Silva", 22);
        UserFinance userFinance1 = new UserFinance(null, "46555019918", "Renana Oliveiro do Silvo", 23);
        UserFinance userFinance2 = new UserFinance(null, "57666120029", "Reinan Oliver do Silvio", 32);

        userFinanceRepository.saveAll(Arrays.asList(userFinance, userFinance1, userFinance2));

    }
}
