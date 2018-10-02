import java.util.LinkedList;

public class Ex1B
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Duck");
		list.add("Goose");
		list.add("Swan");
		list.add("Chicken");
		list.add("Turkey");
		display(list);
	}

	private static void display(LinkedList<String> list) {
		for (String str : list) {
			System.out.print(String.format("%s ", str));
		}
		System.out.println();
	}
}
