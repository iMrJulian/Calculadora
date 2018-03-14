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
public class Decimal extends Conversor{
   @Override
   public int convertiradecimal(String numero) {
       return Integer.parseInt(numero);
   }
   
   @Override
   public String convertirdedecimal(int numero){
         return Integer.toString(numero);
   }
}
