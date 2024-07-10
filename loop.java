package Day1;

public class loop {
	public static void main (String args[]) {
		String a="program";
		for(int i=0;i<=a.length()-1;i++)
		{
			System.out.println(a.charAt(i));
		}
		System.out.println("    ");
		for(int i=0;i<=a.length()/2-1;i++)
		{
			System.out.println(a.charAt(i));
		}
		for(int i=0;i<=a.length()%2-1;i++)
		{
			System.out.println(a.charAt(i));
		}
		
	
	}

}