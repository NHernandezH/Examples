package com.noe.trackauthorizations.repository;


import com.noe.trackauthorizations.entity.Authorization;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noe_5
 */
@Repository
@Transactional
public interface AuthorizationRepositoryH2 extends CrudRepository<Authorization, Integer>{
    
}
