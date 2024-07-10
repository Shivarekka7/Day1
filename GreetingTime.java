package Day1;

public class GreetingTime {
	public static void main (String args[]) {
		int time =7;
		if ((time>=6)&&(time<12)) {
			System.out.println("goodmorning");
		}
		else if((time>=12)&&(time<=17)) {
			System.out.println("goodafternoon");
			
		}
		else if((time>=17)&&(time<=21)){
			System.out.println("goodevening");
		}
		else {
			System.out.println("goodnight");
		}
			
		}
	

}
