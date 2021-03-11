package com.noe.trackauthorizations.controller;


import com.noe.trackauthorizations.dto.AuthorizationDTO;
import com.noe.trackauthorizations.service.AuthorizationTrackingService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noe_5
 */

@RestController()
@RequestMapping("/authorizations")
public class TrackController {
    
    private final AuthorizationTrackingService trackingService;
    
    @Autowired
    public TrackController(AuthorizationTrackingService trackingService){
        this.trackingService = trackingService;
    }
    
    @PostMapping(path = "/")
    public ResponseEntity<AuthorizationDTO> insert(@RequestBody @Valid AuthorizationDTO auth){
        return new ResponseEntity<>(trackingService.insert(auth),HttpStatus.OK);
    }
    
    @PutMapping(path = "/")
    public ResponseEntity<AuthorizationDTO> update(@RequestBody AuthorizationDTO auth){
        return new ResponseEntity<>(trackingService.update(auth),HttpStatus.OK);
    }
    
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable(value = "id") Integer id){
        trackingService.delete(id);
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<AuthorizationDTO> get(@PathVariable(value = "id") Integer id){
        return new ResponseEntity<>(trackingService.getById(id),HttpStatus.OK);
    }
    
    @GetMapping(path = "/")
    public ResponseEntity<List<AuthorizationDTO>> getAll(){
        System.out.println("get");
        trackingService.getAll();
        return new ResponseEntity<>(trackingService.getAll(),HttpStatus.OK);
    }
    
}
