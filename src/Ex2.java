import java.util.Scanner;

public class Ex2 
{

	public static void main(String[] args) 
	{
	
		float [] n = new float[8];
		try (Scanner posi = new Scanner(System.in)) 
		{
			for(int i = 0; i < n.length; i++)
			{
				n[i] = posi.nextFloat();
			}
		}
		
		for (int i = 0; i < n.length; i++)
		{
			if(n[i] <= 10)
			{
				System.out.println("n[" + i + "] = " + n[i] + "\n");
			}
		}
		
	}

}
