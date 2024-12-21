/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator.app;

import java.util.Scanner;

/**
 *
 * @author xps
 */
public class CALCULATORAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 ,num2 ;
        int operation ;
        Scanner input = new Scanner(System.in);
        int value;
        System.out.println("welcome to Calculator app");
        
         System.out.println("\nMenu" );
         System.out.println("1. plus :" );
         System.out.println("2. minus" );
         System.out.println("3. multiply" );
         System.out.println("4. divide" );
         
         System.out.print("Enter your operation: ");
         operation = input.nextInt();
         System.out.println("enter number one" );
         num1 = input.nextInt();
         System.out.println("enter number two" );
         num2 = input.nextInt();
         
         switch (operation){
             case 1:
                 value = num1 + num2 ;
                 System.out .println( "the Sum of "+num1+" and "+num2+" is :"+value);
                 break;
                 
                case 2:
                    value = num1 - num2 ;
                 System.out .println( "the minus of "+num1+" and "+num2+" is :"+value);
                    break;

                case 3:
                    value = num1 * num2 ;
                System.out .println( "the multiplication of "+num1+" and "+num2+" is :"+value);
                   
                    break;

                case 4:
                    try{
                    value = num1 / num2 ;
                    System.out .println( "the division of "+num1+" and "+num2+" is :"+value);
                    }catch(ArithmeticException e)
                            {
                            System.out.println( e);
                            }
                    break;
                    
                    default:
                    System.out.println("Invalid choice. Please try again.");
         }
    }
    
}
