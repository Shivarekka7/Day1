package Day1;

public class Loop1 {

	public static void main(String[] args) {
		int total = 0;
		int mul = 1;

		for (int i = 1; i <= 5; i++) {
			total = total + i;
			mul = total * mul;

		}
		System.out.println(mul);
	}
}
