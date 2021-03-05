package com.renanoliveira.springbootjavarestapi.resources;

import com.renanoliveira.springbootjavarestapi.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/userFinances")
public class UserFinanceResources {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserFinance>> findAll(){
        UserFinance userFinance = new UserFinance("123", "46111058819", "Renan Oliveira da Silva", new ArrayList<>(),  22, new ArrayList<>(), new ArrayList<>());
        UserFinance userFinance1 = new UserFinance("1234", "46111058818", "Renana Oliveiro do Silvo", new ArrayList<>(),  23, new ArrayList<>(), new ArrayList<>());

        List<UserFinance> userFinances = new ArrayList<>();
        userFinances.addAll(Arrays.asList(userFinance, userFinance1));

        return ResponseEntity.ok().body(userFinances);
    }

}
