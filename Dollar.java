import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dollar{
	int amount;

	public Dollar(){	}

	public Dollar(int amount){
		this.amount = amount;
	}

	public Dollar times(int multiplier){
		return new Dollar(amount * multiplier);
	}


}