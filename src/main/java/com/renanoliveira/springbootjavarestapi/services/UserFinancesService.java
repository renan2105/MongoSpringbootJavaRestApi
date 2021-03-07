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

    public void delete(String id){
        findById(id);
        userFinanceRepository.deleteById(id);
    }

    public UserFinance update(UserFinance userFinance) {

        UserFinance userFinanceDB = userFinanceRepository.findById(userFinance.getId()).get();
        updateData(userFinanceDB, userFinance);

        return userFinanceRepository.save(userFinanceDB);
    }

    public void updateData(UserFinance userFinanceDB, UserFinance userFinance){

        userFinanceDB.setDocument(userFinance.getDocument());
        userFinanceDB.setName(userFinance.getName());
        userFinanceDB.setAddress(userFinance.getAddress());
        userFinanceDB.setDebts(userFinance.getDebts());
        userFinanceDB.setAge(userFinance.getAge());
        userFinanceDB.setPatrimonys(userFinance.getPatrimonys());
        userFinanceDB.setSourceIncomes(userFinance.getSourceIncomes());

    }

    public UserFinance fromDTO(UserFinanceDTO userFinanceDTO){
        return new UserFinance(userFinanceDTO.getId(), userFinanceDTO.getDocument(), userFinanceDTO.getName(),
                userFinanceDTO.getDebts(), userFinanceDTO.getAddress(), userFinanceDTO.getAge(),
                userFinanceDTO.getPatrimonys(), userFinanceDTO.getSourceIncomes());
    }

}
