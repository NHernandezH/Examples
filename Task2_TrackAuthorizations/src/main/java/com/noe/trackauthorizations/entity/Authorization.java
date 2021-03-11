/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.trackauthorizations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author noe_5
 */
@Entity
@Table(name = "")
public class Authorization {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name ="description")
    private String description;
    @Column(name ="amount")
    private Long amount;
    @Column(name ="status")
    private String status;

    public Authorization() {
    }

    public Authorization(String description, Long amount, String status) {
        this.description = description;
        this.amount = amount;
        this.status = status;
    }
    
    public Authorization(Integer id, String description, Long amount, String status) {
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
