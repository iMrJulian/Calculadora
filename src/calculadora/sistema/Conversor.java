/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.sistema;

/**
 *
 * @author Estudiantes
 */
public class Conversor {
    
    int a;
    
    public int convertir(String numero,int base){
        switch (base){
            case 1: a = Integer.parseInt(numero,2);
                    break;
            case 2: a = Integer.parseInt(numero,8);
                    break;
            case 3: a = Integer.parseInt(numero);
                    break;
            default: a = Integer.parseInt(numero,16);
                    break;
            
        }
        return a;
    }
    
}
