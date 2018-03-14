/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.conversor;

/**
 *
 * @author Estudiantes
 */
public class Binario extends Conversor{
   @Override
   public int convertiradecimal(String numero) {
       return Integer.parseInt(numero,2);
   }
   
   @Override
   public String convertirdedecimal(int numero){
         return Integer.toBinaryString(numero);
   }
   
    
}
