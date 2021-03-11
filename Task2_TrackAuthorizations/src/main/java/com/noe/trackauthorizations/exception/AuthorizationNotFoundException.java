/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.trackauthorizations.exception;

/**
 *
 * @author noe_5
 */
public class AuthorizationNotFoundException extends RuntimeException{

    private Integer id;
    public AuthorizationNotFoundException(Integer id) {
        this.id = id;
    }
    
    
}
