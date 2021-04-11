import java.util.Scanner;
public class Ex5 
{

	public static void main(String[] args) 
	{
	int a = 0, 
	v = 0,  
	n = 0; 
	
	try(Scanner scan = new Scanner(System.in))
	{
		a = scan.nextInt();
		
		if (a > 1 && a < 1000)
		{
			int[] x = new int[a];
		
			for(int i = 0; i<x.length; i++)
			{
				x[i] = scan.nextInt();
			}
		
			for(int i = 0; i<x.length - 1; i++) 
			{ 
				if(x[i] < x[i + 1])
				{
					n = x[i];
					v = i;
				}
			}
			
			System.out.println("O menor valor é " + n); 
			System.out.println("A posição deste valor é " + v);
		}
	}
	}

}
