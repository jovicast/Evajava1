/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//paquete para usar ventanas - paso1

/**
 *
 * @author LAB07
 */
public class DatosPersonales
{
 public static void main(String[] args)
 {
     //paso2
     
   String nombre;
   int edad=0;
   int incremento=0;
   
     //paso3
     //El showInput recibe datos de entrada por ventana
   nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
   edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
   JOptionPane.showMessageDialog(null, "Bienvenido "+nombre+"en 20 años su edad sera "+incremento+"años");
 }   
    
}
