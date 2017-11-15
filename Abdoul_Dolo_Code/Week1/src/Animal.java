
import com.ex.alive.Livable;

public abstract class Animal implements Livable{
	void consume(String eat, String breathe){
		System.out.println("All animals eat and breathe");
		System.out.println("");
	}

}
