import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dollar extends Money{
	

	public Dollar(){	}

	public Dollar(int amount){
		this.amount = amount;		
	}

	public Dollar times(int multiplier){
		return new Dollar(amount * multiplier);
	}
}