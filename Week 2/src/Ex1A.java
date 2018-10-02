public class Ex1A
{
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4 };
		display(intArray);
	}

	private static void display(int[] intArray) {
		for (int i : intArray) {
			System.out.print(String.format("%d ", i));
		}
		System.out.println();
	}
}
