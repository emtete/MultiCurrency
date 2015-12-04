import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Franc extends Money{
	

	public Franc(){	}

	public Franc(int amount){
		this.amount = amount;		
	}

	public Franc times(int multiplier){
		return new Franc(amount * multiplier);
	}
}