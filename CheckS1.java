package Day1;

public class CheckS1 {
	public static void main (String args[]) {
		String name="TEST";
		char ch=name.charAt(0);
		char sh=name.charAt(name.length()-1);
		if (ch==sh)
		{
			System.out.println("it is equal");
		}
		else {
			System.out.println("it is not equal");
		}
		}
	}


