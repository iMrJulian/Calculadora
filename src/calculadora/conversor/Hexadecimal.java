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
public class Hexadecimal extends Conversor {
   @Override
   public int convertiradecimal(String numero) {
       return Integer.parseInt(numero,16);
   } 
   
   @Override
   public String convertirdedecimal(int numero){
         return Integer.toHexString(numero);
   }
   
}
