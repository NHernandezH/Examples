/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.task1_sumofnumbers;

import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author noe_5
 */
public class Sum {
    
    //Para esta prueba no entendi bien el problema si apartir del numero dado creara la lista y la sumara
    //o dada la lista hiciera la suma, implemente ambas soluciones
    
    public void printSumOfNumbers(Integer n){
        System.out.println(sumOfNumbers(n));
    }
    
    public void printSumOfNumbersInList(List<Integer> n){
        System.out.println(sumOfNumbersInList(n));
    }
    
    public Long sumOfNumbers(Integer n){
        if (n==null){
            return 0L;
        }
        
        return Long.valueOf(IntStream.range(0,n+1).sum());
    }
    
    
    public Long sumOfNumbersInList(List<Integer> n){
        if (n==null){
            return 0L;
        }
        return Long.valueOf(n.stream().mapToInt(Integer::intValue).sum());
    }
    
}
