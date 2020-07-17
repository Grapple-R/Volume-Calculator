/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Taurin
 */
import java.util.Scanner;

public class TWLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	System.out.println("Volume and Area Calculator");
        Scanner input = new Scanner (System.in);
       System.out.println("Enter length ");
        double length = input.nextDouble();
       System.out.print("Enter radius ");
        double radius = input.nextDouble();
         
        double area = radius * radius * Math.PI;
        
        double volume = length * area;
        
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
    
}
