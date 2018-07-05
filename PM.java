import java.util.Scanner;
public class ClassPoint {

public static void main (String[] args)
{
	String pass1 = new String("1234");

	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PASSWARD");
		int pass=sc.nextInt();
		
		String p = String.valueOf(pass);
		
		if (pass1.equals(p))
			
			
		{
			
			System.out.println("right");
		}
		else
			System.out.println("worng");
		
}

}
