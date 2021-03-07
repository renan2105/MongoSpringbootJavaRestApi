package com.renanoliveira.springbootjavarestapi.resources;

import com.renanoliveira.springbootjavarestapi.domain.*;
import com.renanoliveira.springbootjavarestapi.dto.UserFinanceDTO;
import com.renanoliveira.springbootjavarestapi.services.UserFinancesService;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/userFinances")
public class UserFinanceResources {

    @Autowired
    private UserFinancesService userFinancesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserFinanceDTO>> findAll(){

        List<UserFinance> userFinances = userFinancesService.findAll();
        List<UserFinanceDTO> userFinancesDto = userFinances.stream().map(x -> new UserFinanceDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(userFinancesDto);
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserFinanceDTO> findById(@PathVariable String id){

        UserFinance userFinance = userFinancesService.findById(id);

        return ResponseEntity.ok().body(new UserFinanceDTO(userFinance));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody UserFinanceDTO userFinanceDTO){

        UserFinance userFinance = userFinancesService.fromDTO(userFinanceDTO);
        userFinance = userFinancesService.insert(userFinance);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userFinance.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserFinanceDTO> delete(@PathVariable String id){

        userFinancesService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
