package com.renanoliveira.springbootjavarestapi.services;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;
import com.renanoliveira.springbootjavarestapi.dto.UserFinanceDTO;
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

    public UserFinance insert(UserFinance userFinance){

        return userFinanceRepository.insert(userFinance);

    }

    public UserFinance fromDTO(UserFinanceDTO userFinanceDTO){

        return new UserFinance(userFinanceDTO.getId(), userFinanceDTO.getDocument(), userFinanceDTO.getName(), userFinanceDTO.getAge());

    }

}
