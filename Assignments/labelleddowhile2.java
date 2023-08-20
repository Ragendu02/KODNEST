package predict;

public class labelleddowhile2 {
	public static void main(String[]args)
	{
		System.out.println("start");
		int i=1; 
		first:do
		{
		i++;
		
		
		int j=1;
		second:do {
		
			System.out.print("kodnest ");
			j++;
			break second;
		}while(j<=5);
		
		
		
		
	}while(i<=5);
		System.out.println();
		
	}
}
