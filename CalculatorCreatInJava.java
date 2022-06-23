
package calculator.creat.in.java;

import java.util.Scanner;

public class CalculatorCreatInJava {

    public static void main(String[] args) {
        double num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First number :");
        num1=scanner.nextDouble();
        
        System.out.print("Enter opertor(+,-,*,/) :");
        char operator=scanner.next().charAt(0);
        
        System.out.print("Enter second number : ");
        num2=scanner.nextDouble();
        scanner.close();
        double output;
        
        switch(operator)
        {
         
            case '+':
             output=num1+num2;
                 break;
                 
            case '-':
              output=num1-num2;
              break;
              
            case '*':
                output=num1*num2;
                break;
            case '/':
                output=num1/num2;
                        break;
           default:
                System.out.printf("Entered wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);

    }
    
}
