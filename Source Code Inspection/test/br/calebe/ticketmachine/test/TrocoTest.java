/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *    @author zucchi
 */
public class TrocoTest {

   @Test
    public void trocoTest(){
        Troco t = new Troco(7);
        PapelMoeda[] pmList = new PapelMoeda[6];
        
        PapelMoeda pm1 = new PapelMoeda(5, 1);
        pmList[1] = pm1;
        
        PapelMoeda pm2 = new PapelMoeda(2, 1);
        pmList[0] = pm2;
        
        assertEquals(pmList[0].getValor(), 2);
        assertEquals(pmList[0].getQuantidade(), 1);
        
        assertEquals(pmList[1].getValor(), 5);
        assertEquals(pmList[1].getQuantidade(), 1);
    }
}