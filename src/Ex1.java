import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args) 
	{
		
		int[] n = new int[10];
		try (Scanner scan = new Scanner(System.in)) 
		{
			int x = scan.nextInt();
			
			while(!(x <= 50 && x > 0)) 
			{
				System.out.println("Digite um valor menor que 50 e maior que 0");
				x = scan.nextInt();
			}
			
			n[0] = x;
		} 
		
		System.out.println("n[0] = " + n[0]);
		
		for (int i = 1; i < n.length; i++)
		{
			n[i] = (n[i - 1] * 2);
			System.out.println("n[" + i + "] = " + n[i]);
		}

	}
}

