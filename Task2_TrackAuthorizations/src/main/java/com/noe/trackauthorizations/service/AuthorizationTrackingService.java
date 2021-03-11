package com.noe.trackauthorizations.service;


import com.noe.trackauthorizations.dto.AuthorizationDTO;
import com.noe.trackauthorizations.entity.Authorization;
import com.noe.trackauthorizations.exception.AuthorizationNotFoundException;
import com.noe.trackauthorizations.mappers.AuthorizationMapper;
import com.noe.trackauthorizations.repository.AuthorizationRepositoryH2;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noe_5
 */
@Service
@Validated
public class AuthorizationTrackingService {
    
    private final AuthorizationRepositoryH2 authRepository;

    @Autowired
    public AuthorizationTrackingService(AuthorizationRepositoryH2 authRepository) {
        this.authRepository = authRepository;
    }
    
    
    public AuthorizationDTO insert(@Valid AuthorizationDTO auth){
        Authorization entity = AuthorizationMapper.AuthorizationDTOToAuthorization(auth);
        entity = authRepository.save(entity);
        return AuthorizationMapper.AuthorizationToAuthorizationDTO(entity);
    }
    
    public AuthorizationDTO update(AuthorizationDTO auth){
        Authorization entity = AuthorizationMapper.AuthorizationDTOToAuthorization(auth);
        entity = authRepository.save(entity);
        return AuthorizationMapper.AuthorizationToAuthorizationDTO(entity);
    }
    
    public void delete(Integer id){
        authRepository.deleteById(id);
    }
    
    public AuthorizationDTO getById(Integer id) {
        Authorization entity= authRepository.findById(id)
                .orElseThrow(()-> new AuthorizationNotFoundException(id));
        return AuthorizationMapper.AuthorizationToAuthorizationDTO(entity);
    }
    
    public List<AuthorizationDTO> getAll(){
        List<AuthorizationDTO> authorizations = new ArrayList<>();
        authRepository.findAll().forEach((auth)->{
            authorizations.add(AuthorizationMapper.AuthorizationToAuthorizationDTO(auth));
        });
        return authorizations;
    }
}
