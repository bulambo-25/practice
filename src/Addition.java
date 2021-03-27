/**
 * @(#)Addition.java
 *
 *
 * @Benelzane218257465
 * @version 1.00 2019/4/2
 */
import java.util.Scanner;  // Import the Scanner class

public class Addition 
{
//Instance variables
private int num1;
private int num2;
private int answer;
    public Addition() 
    {
    }//end of null argument constructor
    
    public int Add()
    {
    	Scanner input = new Scanner(System.in);//including the scanner inside the add method
    	
     System.out.println("Enter first integer:");//prompting the user for the input
   	 num1 = input.nextInt();
   	 
   	 System.out.println("Enter second interger");//prompting the user for input
   	 num2 = input.nextInt();
   	 
   	 answer = num1 + num2;
   	 System.out.printf("The answer is equal to :%d ",answer);// printing the answer
    	
    return answer;	
    }//end of Add method
}//end of Addition class