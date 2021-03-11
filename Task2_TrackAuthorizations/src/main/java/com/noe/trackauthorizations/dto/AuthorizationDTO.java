package com.noe.trackauthorizations.dto;


import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
@Validated
public class AuthorizationDTO implements Serializable{
    
    static final long serialVersionUID = 42L;
    
    
    private Integer id;
    @NotEmpty(message = "description is required")
    private String description;
    @NotNull(message="amount is required")
    private Long amount;
    @NotEmpty(message = "status is required")
    private String status;

    public AuthorizationDTO() {
    }
    
    

    public AuthorizationDTO(Integer id, String description, Long amount, String status) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.status = status;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
