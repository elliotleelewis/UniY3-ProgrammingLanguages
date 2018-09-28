package Ex4B;
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
			Animal a = animals[i];
			System.out.println(String.format("Animal %d is %d years old and goes %s!", i + 1, a.age, a.speak()));
		}
	}
}
