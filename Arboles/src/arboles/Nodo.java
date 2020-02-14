/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author HOME
 */
public class Nodo 
{
    int info;
    Nodo izq, der;
    public Nodo(int x)
    {
        info=x;
        izq=der=null;
    }
    
}
