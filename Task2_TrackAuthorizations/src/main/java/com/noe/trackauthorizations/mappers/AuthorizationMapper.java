/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.trackauthorizations.mappers;

import com.noe.trackauthorizations.dto.AuthorizationDTO;
import com.noe.trackauthorizations.entity.Authorization;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author noe_5
 */
public  class AuthorizationMapper {
    
    public static Authorization AuthorizationDTOToAuthorization(AuthorizationDTO authorization){
        return new Authorization(
                authorization.getId(), 
                authorization.getDescription(), 
                authorization.getAmount(), 
                authorization.getStatus()
        );
    }
    
    public static AuthorizationDTO AuthorizationToAuthorizationDTO(Authorization authorization){
        return new AuthorizationDTO(
                authorization.getId(), 
                authorization.getDescription(), 
                authorization.getAmount(), 
                authorization.getStatus()
        );
    }
    
    public static List<AuthorizationDTO> AuthorizationToAuthorizationDTO(List<Authorization> authorizations){
        return authorizations.stream()
                .map(AuthorizationMapper::AuthorizationToAuthorizationDTO)
                .collect(Collectors.toList());
    }
}
