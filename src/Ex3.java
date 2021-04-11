import java.util.Scanner;

public class Ex3 
{
	public static void main(String[] args) 
	{
	int n[] = new int [20];
	int tr, 
	posi = 1;
	
	try (Scanner scan = new Scanner(System.in)) 
	{
		for(int i = 0; i < n.length; i++)
		{
			n[i] = scan.nextInt();
		}
	}
	
	for(int x = 0; x < n.length/2; x++)
	{
		tr = n[x];
		n[x] = n[n.length - posi];
		n[n.length - posi] = tr;
		
		posi++;
	}
	
	for(int g = 0; g < n.length; g++)
	{
		System.out.println("n[" + g + "] = " + n[g]);
	}
	}

}
