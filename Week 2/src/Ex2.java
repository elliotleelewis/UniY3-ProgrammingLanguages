public class Ex2
{
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		System.out.println("intArray:");
		printArray(intArray);
		System.out.println();
		System.out.println("doubleArray:");
		printArray(doubleArray);
		System.out.println();
		System.out.println("charArray");
		printArray(charArray);
	}

	private static void printArray (Object[] arr) {
		for (Object el : arr) {
			System.out.println(el);
		}
	}
}
