package Ex4B;
import java.util.Random;
public abstract class Animal
{
	private Random random = new Random();
	int age = 1 + random.nextInt(13);

	abstract String speak();
}
