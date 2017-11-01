/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import java.util.Scanner;//paso 1
/**
 *
 * @author LAB07
 */
public class rectangulo {
    
  public static void main(String[] args)
  {
    float area, base, altura;//paso2
    Scanner sc = new Scanner(System.in);//paso3
    
    System.out.println("ingrese la base del rectangulo");
    base = sc.nextFloat();//Leo y guardo los datos de entrada 
    
    System.out.println("ingrese la altura del rectangulo");
    altura = sc.nextFloat();
    
    //paso5
    
    area=base*altura;
    System.out.println("El area de su rectangulo es:"+area+"mts2");
    
    
      
  }   
}
