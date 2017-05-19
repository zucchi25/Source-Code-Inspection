/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;


import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *   @author zucchi
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @Test
    public void testarInserir() throws PapelMoedaInvalidaException{
        assertEquals(tm.inserir(2), tm.getSaldo());
        assertEquals(tm.inserir(5), tm.getSaldo());
        assertEquals(tm.inserir(10), tm.getSaldo());
        assertEquals(tm.inserir(20), tm.getSaldo());
        assertEquals(tm.inserir(50), tm.getSaldo());
        assertEquals(tm.inserir(100), tm.getSaldo());
    }
    @Test
    public void getSaldoTest() {
        int valor = 8;
        TicketMachine ticketMachine = new TicketMachine(8);
        try {
            ticketMachine.inserir(valor);
        } catch (Exception ex) {
            System.out.println("É diferente da cédula");
        }
        assertEquals(valor, ticketMachine.getSaldo());

    }
    
    
     @Test
    public void ImprimirTest() {
      int valor = 300;
       String result = "*****************\n";
        result += "*** R$ " + valor + ",00 ****\n";
        result += "*****************\n";
        
        TicketMachine ticketMachine = new TicketMachine(35);
        try {
            ticketMachine.inserir(valor);
            assertEquals(result, ticketMachine.imprimir());
        } catch (Exception ex) {
    
}
    }
}

