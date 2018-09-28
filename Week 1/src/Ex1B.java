public class Ex1B
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 200; i++) {
			String out = "";
			if (i % 3 == 0) {
				out += "Fizz";
			}
			if (i % 5 == 0) {
				out += "Buzz";
			}
			System.out.println(out.equals("") ? i : out);
		}
	}
}
