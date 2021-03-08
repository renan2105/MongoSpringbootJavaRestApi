package com.renanoliveira.springbootjavarestapi.resources;

import com.renanoliveira.springbootjavarestapi.domain.Traceability;
import com.renanoliveira.springbootjavarestapi.dto.TraceabilityDTO;
import com.renanoliveira.springbootjavarestapi.services.TraceabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/traceabilitys")
public class TraceabilityResources {

    @Autowired
    private TraceabilityService traceabilityService;

    @RequestMapping(value= "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<TraceabilityDTO>> findAll(){

        List<Traceability> traceabilitys = traceabilityService.findAll();
        List<TraceabilityDTO> traceabilitysDto = traceabilitys.stream().map(x -> new TraceabilityDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(traceabilitysDto);
    }

    @RequestMapping(value= "/findById/{id}", method = RequestMethod.GET)
    public ResponseEntity<TraceabilityDTO> findById(@PathVariable String id){

        Traceability traceability = traceabilityService.findById(id);

        return ResponseEntity.ok().body(new TraceabilityDTO(traceability));
    }

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody TraceabilityDTO traceabilityDTO){

        Traceability traceability = traceabilityService.fromDTO(traceabilityDTO);
        traceability = traceabilityService.insert(traceability);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(traceability.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value= "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<TraceabilityDTO> delete(@PathVariable String id){

        traceabilityService.delete(id);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value= "/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable String id ,@RequestBody TraceabilityDTO traceabilityDTO){

        Traceability traceability = traceabilityService.fromDTO(traceabilityDTO);
        traceability.setId(id);
        traceability = traceabilityService.update(traceability);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value= "/findByDocument/{document}", method = RequestMethod.GET)
    public ResponseEntity<TraceabilityDTO> findByDocument(@PathVariable String document){

        Traceability traceability = traceabilityService.findByDocument(document);

        return ResponseEntity.ok().body(new TraceabilityDTO(traceability));
    } 

}
