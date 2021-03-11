/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.task1_sumofnumbers;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noe_5
 */
public class SumTest {
    
    Sum sum = new Sum();
    public SumTest() {
    }
    
    
    @Test
    public void testWhenNumberIsNull() {
        sum.printSumOfNumbers(null);
        assertEquals(Long.valueOf(0),sum.sumOfNumbers(null));
    }
    
    @Test
    public void testWhenNumberIsNotNull() {
        sum.printSumOfNumbers(9);
        assertEquals(Long.valueOf(45),sum.sumOfNumbers(9));
    }

   
    @Test
    public void testWhenListIsNull() {
        sum.printSumOfNumbersInList(null);
        assertEquals(Long.valueOf(0),sum.sumOfNumbersInList(null));
    }
    
    
    @Test
    public void testWhenListIsEmpty() {
        sum.printSumOfNumbersInList(Arrays.asList());
        assertEquals(Long.valueOf(0),sum.sumOfNumbersInList(Arrays.asList()));
    }
    
    @Test
    public void testWhenListContainsElements() {
        sum.printSumOfNumbersInList(Arrays.asList(4,6,5,8,7));
        assertEquals(Long.valueOf(30),sum.sumOfNumbersInList(Arrays.asList(4,6,5,8,7)));
    }
}
