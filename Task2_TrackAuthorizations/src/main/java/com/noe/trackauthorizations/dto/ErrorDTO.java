/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.trackauthorizations.dto;

/**
 *
 * @author noe_5
 */
public class ErrorDTO {
    
    private String message;
    private String status;

    public ErrorDTO(String message, String status) {
        this.message = message;
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
