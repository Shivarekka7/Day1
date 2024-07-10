package Day1;

public class CheckS {
	public static void main (String args[]) {
		String name="Hello@world";
		
		char ch = name.charAt(name.length()/2);
		if(ch>='A'&& ch<='z') {
			System.out.println("alphabets");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("numbers");
		}
		else {
			System.out.println("special character");
		}
		
		
		
	}

}
