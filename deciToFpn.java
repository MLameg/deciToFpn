//********************************************************
// Name: Monti Lameg                Homework 1: Prob. 2
//
// Convert decimal numbers to 32-bit FPN
//********************************************************
import java.util.Scanner;

class DecitoFPN 
{
   public static void main(String args[])
   {
      // Converts decimal number 12 to 32-bit FPN
      float twelve = 12;
      int sample = Float.floatToIntBits(twelve);
      String test = Integer.toBinaryString(sample);
      System.out.println("Decimal Number 12 converted to 32-bit FPN: ");
      System.out.println("0"+test);
      
      
      // Scanner that stores user input into a string
      Scanner scan = new Scanner(System.in);     
      System.out.println("Please enter a decimal number to be converted:");
      String decimal = scan.nextLine();
      
      // Converts string to float, float to FP single format bit layout, 
      // int to binary string representation
      float deci = Float.parseFloat(decimal);
      int value = Float.floatToIntBits(deci);
      String fpn = Integer.toBinaryString(value);
      
      // Prints 32-bit FPN, prints 0 if sign = 0
      if ( deci >= 0)
         System.out.println("0"+fpn);
      else
         System.out.println(fpn);
}}