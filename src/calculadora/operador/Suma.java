/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operador;

/**
 *
 * @author Julian Rincon, Leonardo Wiesner, Juan Blanco
 */
public class Suma extends Operaciones {
    
    @Override
    public int resultado (){
        return this.getNumero1() + this.getNumero2();   
    }
    
}
