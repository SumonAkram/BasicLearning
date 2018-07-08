
Input:
Scanner a = new Scanner(System.in);
1) nextInt to input an integer
2) nextFloat to input a float
3) nextLine to input a string

Output: System.out.println(""); KB Shortcut: sysout -->ctrl+space


#Print Hello World Program.

public class Main {
	
	public static void main (String[] args) {
		System.out.println("Hello SAS");
	}
}


#Input an integer, float & string then print.

import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
 
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float "+b);   
 
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);
   }
}
