/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopila;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    
    int info; //se puede char, double o string
    Nodo sig;
    
    Nodo(int x)
    {
     info=x;
     sig=null;
    }
    
}
