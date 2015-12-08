import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Franc extends Money{
	

	public Franc(){	}

	Franc(int amount, String currency){
		super(amount, currency);
	}

	Money times(int multiplier){
		return Money.franc(amount * multiplier);
	}

	
}