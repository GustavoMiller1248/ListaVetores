import javax.swing.JOptionPane;

public class Ex4 
{

	public static void main(String[] args) 
	{
	double n[] = new double [100];
	String result = "";
	
	n[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
	
	for(int i=1; i<n.length; i ++)
	{
		n[i] = n[i - 1]/2;
	}
	
	for(int z = 0; z < n.length; z++)
	{
		result = String.format("%.4f", n[z]);
		System.out.println("n[" + z + "] = " + result);
	}
	}

}
