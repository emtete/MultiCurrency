import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dollar extends Money{
	

	public Dollar(){	}

	Dollar(int amount, String currency){
		super(amount, currency);
	}

	Money times(int multiplier){
		return Money.dollar(amount * multiplier);
	}
	
}