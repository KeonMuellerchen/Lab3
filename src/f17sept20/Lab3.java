package f17sept20;

import java.util.Scanner;

/**
 * This application displays the number returned from the largestNumber method.
 * @data Sept 21st, 2017
 * @author Keon Muellerchen
 */
public class Lab3 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the first number:");
        float number1 = keyboard.nextFloat();
        
        System.out.print("Enter the second number:");
        float number2 = keyboard.nextFloat();
        
        System.out.print("Enter the third number:");
        float number3 = keyboard.nextFloat();
        
        //outputs the largest number
        System.out.printf("The largest number is: %.1f ", largestNumber(number1, number2, number3));
        
    }//end of main
    
    /**
     * This method will accept 3 numbers and return the largest number.
     */
    public static float largestNumber(float num1, float num2, float num3)
    {
        if (num1 > num2 && num1 > num3)
            return num1;
        else if (num2 > num1 && num2 > num3)
            return num2;
        else
            return num3;
            
    }//end of largestNumber
}//end of class Lab3
