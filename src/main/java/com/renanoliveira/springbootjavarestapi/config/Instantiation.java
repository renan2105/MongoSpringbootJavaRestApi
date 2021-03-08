package com.renanoliveira.springbootjavarestapi.config;

import com.renanoliveira.springbootjavarestapi.domain.Traceability;
import com.renanoliveira.springbootjavarestapi.dto.*;
import com.renanoliveira.springbootjavarestapi.enums.PatrimonyTypeEnum;
import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.repository.TraceabilityRepository;
import com.renanoliveira.springbootjavarestapi.repository.UserFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserFinanceRepository userFinanceRepository;

    @Autowired
    private TraceabilityRepository traceabilityRepository;

    @Override
    public void run(String... args) throws Exception {

        userFinanceRepository.deleteAll();

        traceabilityRepository.deleteAll();

        UserFinance userFinanceRenan = new UserFinance(null, "46111058818", "Renan Oliveira da Silva",
                new AddressDTO("Sonia Maria F. de Andrade", "Jardim Novo Horizonte", "Jandira", "Sao Paulo", "Brasil", "number 69"),  22);
        UserFinance userFinanceRenana = new UserFinance(null, "46555019918", "Renana Oliveiro do Silvo",
                new AddressDTO("Fernandes de Andrade", "Jardim Horizonte", "ira", "Sao Paulo", "Brasil", "number 9"), 23);
        UserFinance userFinanceReinan = new UserFinance(null, "57666120029", "Reinan Oliver do Silvio",
                new AddressDTO("Sonia Maria", "Jardim Novo", "Jand", "Sao Paulo", "Brasil", "number 6"), 32);

        DebtDTO debt1RealMatheus = new DebtDTO("1RealMatheus", 22.50);
        DebtDTO debtSodie = new DebtDTO("Sodie", 100.00);
        DebtDTO debtCafeMillie = new DebtDTO("CafeMillie", 14.50);

        userFinanceRenan.getDebts().addAll(Arrays.asList(debt1RealMatheus, debtSodie));
        userFinanceRenana.getDebts().addAll(Arrays.asList(debt1RealMatheus, debtCafeMillie));
        userFinanceReinan.getDebts().addAll(Arrays.asList(debtSodie, debtCafeMillie));

        PatrimonyDTO patrimonyCar = new PatrimonyDTO(PatrimonyTypeEnum.CAR, "Hylux 2020", 90000.00);
        PatrimonyDTO patrimonyHouse = new PatrimonyDTO(PatrimonyTypeEnum.PROPERTIES, "House Alphaville", 950000.00);

        userFinanceRenan.getPatrimonys().add(patrimonyCar);
        userFinanceRenana.getPatrimonys().addAll(Arrays.asList(patrimonyCar, patrimonyHouse));
        userFinanceReinan.getPatrimonys().add(patrimonyHouse);

        SourceIncomeDTO sourceIncomeNubank = new SourceIncomeDTO("Investimento Nubank", 2000.00);
        SourceIncomeDTO sourceIncomeProgramador = new SourceIncomeDTO("Trabalho de Programador", 6000.00);
        SourceIncomeDTO sourceIncomeProfessor = new SourceIncomeDTO("Trabalho de Professor", 7000.00);
        SourceIncomeDTO sourceIncomeMetalurgico = new SourceIncomeDTO("Trabalho de Metalurgico", 5000.00);

        userFinanceRenan.getSourceIncomes().add(sourceIncomeProgramador);
        userFinanceRenana.getSourceIncomes().addAll(Arrays.asList(sourceIncomeNubank, sourceIncomeProfessor));
        userFinanceReinan.getSourceIncomes().add(sourceIncomeMetalurgico);

        userFinanceRepository.saveAll(Arrays.asList(userFinanceRenan, userFinanceRenana, userFinanceReinan));

        Traceability traceabilityRenan = new Traceability(null, "46111058818", new Date(), new LastPurchaseWithCreditCardDTO("Razer", 400.00));
        Traceability traceabilityRenana = new Traceability(null, "46555019918", new Date(), new LastPurchaseWithCreditCardDTO("Amazon", 500.00));
        Traceability traceabilityReinan = new Traceability(null, "57666120029", new Date(), new LastPurchaseWithCreditCardDTO("Riot Games", 100.00));

        FinancialMovementsDTO financialMovementsJoaoRenan = new FinancialMovementsDTO("Joao Roberto de Nobrega", "Renan Oliveira da Silva", 20.00);
        FinancialMovementsDTO financialMovementsRenanaJoao = new FinancialMovementsDTO("Renana Oliveiro do Silvo", "Joao Roberto de Nobrega", 200.00);
        FinancialMovementsDTO financialMovementsJoaoRenana = new FinancialMovementsDTO("Joao Roberto de Nobrega","Renana Oliveiro do Silvo",  100.00);
        FinancialMovementsDTO financialMovementsJoaoReinan = new FinancialMovementsDTO("Joao Roberto de Nobrega", "Reinan Oliver do Silvio", 50.00);

        traceabilityRenan.getFinancialMovements().add(financialMovementsJoaoRenan);
        traceabilityRenana.getFinancialMovements().addAll(Arrays.asList(financialMovementsJoaoRenana, financialMovementsRenanaJoao));
        traceabilityReinan.getFinancialMovements().add(financialMovementsJoaoReinan);

        traceabilityRepository.saveAll(Arrays.asList(traceabilityRenan, traceabilityRenana, traceabilityReinan));

    }
}
