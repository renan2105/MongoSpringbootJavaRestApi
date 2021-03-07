package com.renanoliveira.springbootjavarestapi.config;

import com.renanoliveira.springbootjavarestapi.domain.Address;
import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.repository.UserFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserFinanceRepository userFinanceRepository;

    @Override
    public void run(String... args) throws Exception {

        userFinanceRepository.deleteAll();

        UserFinance userFinance = new UserFinance(null, "46111058818", "Renan Oliveira da Silva",
                new Address("Sonia Maria F. de Andrade", "Jardim Novo Horizonte", "Jandira", "Sao Paulo", "Brasil", "number 69"), 22);
        UserFinance userFinance1 = new UserFinance(null, "46555019918", "Renana Oliveiro do Silvo",
                new Address("Fernandes de Andrade", "Jardim Horizonte", "ira", "Sao Paulo", "Brasil", "number 9"), 23);
        UserFinance userFinance2 = new UserFinance(null, "57666120029", "Reinan Oliver do Silvio",
                new Address("Sonia Maria", "Jardim Novo", "Jand", "Sao Paulo", "Brasil", "number 6"), 32);

        userFinanceRepository.saveAll(Arrays.asList(userFinance, userFinance1, userFinance2));

    }
}
