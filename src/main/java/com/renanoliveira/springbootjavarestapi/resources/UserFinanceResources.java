package com.renanoliveira.springbootjavarestapi.resources;

import com.renanoliveira.springbootjavarestapi.domain.*;
import com.renanoliveira.springbootjavarestapi.services.UserFinancesService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserFinancesService userFinancesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserFinance>> findAll(){

        List<UserFinance> userFinances = userFinancesService.findAll();

        return ResponseEntity.ok().body(userFinances);
    }

}
