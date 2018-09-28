package Ex4A;
public class Main
{
	public static void main(String[] args)
	{
		Animal[] animals = {
			new Cat(),
			new Cow(),
			new Dog(),
			new Cat(),
			new Cow(),
			new Dog(),
			new Cat(),
			new Cow(),
			new Dog(),
		};
		for(int i = 0; i < animals.length; i++) {
			System.out.println(String.format("Animal %d goes %s!", i + 1, animals[i].speak()));
		}
	}
}
