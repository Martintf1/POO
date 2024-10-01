/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cortedos;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ejer3 {
  public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double[] altura = new double[5];
        int promedioAbajo=0;
        int promedioArriba=0;
        double suma = 0;
        
        for (int i = 0; i<altura.length;i++)
        {
            System.out.println("Digite "+(i+1)+" altura : ");
            altura[i]= sc.nextDouble();
            suma+=altura[i];
            
            
        }
        
        suma/=5;
        for(int i =0;i<altura.length;i++)
        {
            if (altura[i]>suma)
            {
                promedioArriba+=1;
            }
            else 
            {
                promedioAbajo+=1;
            }
        }
        System.out.println("hay "+promedioArriba+" personas ariba del promedio");
        System.out.println("hay "+promedioAbajo+" personas abajo del promedio");
    }
}
