package Day1;

public class Sloop1 {
	
		public static void main (String args[]) {
			String st="mam";
			String rev=" ";
			for (int i=st.length()-1;i>=0;i--) {
				rev=rev+(st.charAt(i));
				
					
			}
			if(st.equals(rev)) {
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}

	}


