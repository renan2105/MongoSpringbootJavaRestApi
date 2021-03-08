package com.renanoliveira.springbootjavarestapi.services;

import com.renanoliveira.springbootjavarestapi.domain.Traceability;
import com.renanoliveira.springbootjavarestapi.dto.TraceabilityDTO;
import com.renanoliveira.springbootjavarestapi.repository.TraceabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraceabilityService {

    @Autowired
    private TraceabilityRepository traceabilityRepository;

    public List<Traceability> findAll(){
        return traceabilityRepository.findAll();
    }

    public Traceability findById(String id){
        Optional<Traceability> traceability = traceabilityRepository.findById(id);
        return traceability.orElseThrow(() -> new ObjectNotFoundException("traceability not found"));
    }

    public Traceability insert(Traceability traceability){
        return traceabilityRepository.insert(traceability);
    }

    public void delete(String id){
        findById(id);
        traceabilityRepository.deleteById(id);
    }

    public Traceability update(Traceability traceability) {

        Traceability traceabilityDB = traceabilityRepository.findById(traceability.getId()).get();
        updateData(traceabilityDB, traceability);

        return traceabilityRepository.save(traceabilityDB);
    }

    public Traceability findByDocument(String document){
        return traceabilityRepository.findByDocumentContaining(document);
    }

    public void updateData(Traceability traceabilityDB, Traceability traceability){

        traceabilityDB.setDocument(traceability.getDocument());
        traceabilityDB.setFinancialMovements(traceability.getFinancialMovements());
        traceabilityDB.setLastConsultationInBureau(traceability.getLastConsultationInBureau());
        traceabilityDB.setLastPurchaseWithCreditCard(traceability.getLastPurchaseWithCreditCard());

    }

    public Traceability fromDTO(TraceabilityDTO traceabilityDTO){
        return new Traceability(traceabilityDTO.getId(), traceabilityDTO.getDocument(),
                traceabilityDTO.getLastConsultationInBureau(), traceabilityDTO.getLastPurchaseWithCreditCard());
    }


}
