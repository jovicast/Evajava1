/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Octubre 31 de 2017
 * Programa: Clase3Myriam
 * Responsabilidad: Clase Principal
 ************************************/
public class Nomina 
{ 
     public static void main(String[] args)
    {
     float horas;
     float valor;
     float sueldo;
    
      
     //El showInput recibe datos de entrada por ventana
     horas= Float.parseFloat(JOptionPane.showInputDialog("digite su horas"));
     valor= Float.parseFloat(JOptionPane.showInputDialog("digite su valor")); 
    
             
     sueldo= valor*horas;
     JOptionPane.showMessageDialog(null,"sueldo"+sueldo);
     }  
}
